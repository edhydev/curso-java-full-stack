// Call the dataTables jQuery plugin
$(document).ready(async function () {
    await loadUsers();
    $('#users').DataTable();
});


async function loadUsers() {
    const request = await fetch('user', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
    });
    const users = await request.json();
    let userListHTML = '';

    for (const user of users) {
        userListHTML += `<tr><td>${user.name}</td><td>${user.name} ${user.surnames}</td><td>${user.email}</td><td>${user.phone}</td><td><a href=\"#\" class=\"btn btn-danger btn-circle\"><i class=\"fas fa-trash\"></i></a></td></tr>`;
    }

    document.querySelector("#users tbody").outerHTML = userListHTML;
}