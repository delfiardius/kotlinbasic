package com.dicodingdelfi.kotlin.lambda_expression

/*fun upperCaseString(text: String): String {
    return text.uppercase()
}*/

// the top function can concise with lambda expression
fun main() {
    val upperCaseString = {text: String -> text.uppercase()}
    print(upperCaseString("hello"))
}