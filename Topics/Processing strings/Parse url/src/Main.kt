fun main() {
    // write your code here
    val url = readLine()!!.split("[&,?]".toRegex()).map { it }.toMutableList()
    url.removeAt(0)

    var password = ""
    for (parameter in url) {
        if (parameter.contains("pass")) {
            password = parameter.replace("=", " : ")
        }

        if (parameter.contains("=\$".toRegex())) {
            println(parameter.replace("=", " : not found"))
        } else {
            println(parameter.replace("=", " : "))
        }
    }

//    if (password.length < 0) {
    print(password.replace("pass", "password"))
//    }
}