// Moving Script
function MovePage(code) {
    var url;
    if (code == "1") { // Back to page
        url = "http://localhost:8080/welcome-page"
    } else if (code == "2") { // Edit Page
        url = "http://localhost:8080/edit-page"
    } else if (code == "3") { // About Page
		url = "#"
    } else if (code == "4") { // Login
		url = "http://localhost:8080/login-user"
    } else if (code == "5") { // Register
		url = "http://localhost:8080/register-user"
    }
    window.location = url;
}