package com.dicodingdelfi.kotlin.function


// a list of registered usernames
val registeredUsernames = mutableListOf<String>(
    "john_doe", "jane_smith", "ardi_gulo", "delfi_gulo"
)

// a list of registered emails
val registeredEmails = mutableListOf<String>(
    "john@example.com", "jane@example.com", "ardi@example.com", "delfi@example.com"
)

fun registerUser(username: String, email: String) : String {
    //Early return if the username is already taken
    if (username in registeredUsernames) {
        return "Username already taken. Please choose a different username."
    }

    //Early return if the email is already registered
    if (email in registeredEmails) {
        return "Email already registered. Please use a different email."
    }

    //Proceed with the registrattion if the username and email are not taken
    registeredUsernames.add(username)
    registeredEmails.add(email)

    return "User registered successfully: $username"
}

fun main() {
    println(registerUser("john_doe", "newjohn@example.com"))
    println(registerUser("new_user", "newuser@example.com"))
}