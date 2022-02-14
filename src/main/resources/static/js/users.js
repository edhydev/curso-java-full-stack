// Call the dataTables jQuery plugin
$(document).ready(async function () {
    await loadUsers();
    $('#users').DataTable();
});


async function loadUsers() {
    const request = await fetch('api/user', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
    });
    const users = await request.json();
    let userListHTML = '';
    for (const user of users) {
        let deleteBtn = `<a href=\"#\" onclick="deleteUser(${user.id})" class=\"btn btn-danger btn-circle\"><i class=\"fas fa-trash\"></i></a>`;
        userListHTML += `<tr><td>${user.id}</td><td>${user.name} ${user.surnames}</td><td>${user.email}</td><td>${user.phone === null ? '-' : user.phone}</td><td>${deleteBtn}</td></tr>`;
    }

    document.querySelector("#users tbody").outerHTML = userListHTML;
}

async function deleteUser(id) {
    if (confirm('¿Desea eliminar este usuario?')) {
        await fetch('api/user/' + id, {
            method: 'DELETE',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
        });
        location.reload();
    }
}