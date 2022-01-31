$(document).ready(async function () {
    // on ready
});

async function register() {
    const form = {}
    form.name = document.getElementById("txtName").value;
    form.surnames = document.getElementById("txtSurnames").value;
    form.email = document.getElementById("txtEmail").value;
    form.phone = document.getElementById("txtPhone").value;
    form.password = document.getElementById("txtPwd").value;
    form.passwordConfirm = document.getElementById("txtPwdConfirm").value;

    if (checkValues(form)) {
        const request = await fetch('api/user', {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(form)
        });
    }
}

function checkValues(form) {
    if (form.password !== form.passwordConfirm) {
        alert('La contraseña que escribiste es diferente!')
        return false
    }

    if (form.name === "") {
        alert('Escriba su nombre');
        return false;
    }

    if (form.surnames === "") {
        alert('Escriba sus apellidos');
        return false;
    }

    if (form.email === "") {
        alert('Ingrese su correo electrónico');
        return false;
    }

    if (form.phone === "") {
        alert('Ingrese su número telefónico');
        return false;
    }

    return true;
}