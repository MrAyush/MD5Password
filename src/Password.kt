import Password.Encrypt

fun main(arg: Array<String>) {
    var str = readLine()
    val encrypt = Encrypt(str!!)
    str = encrypt.getString()
    println("This-> $str")
    str = encrypt.getEncryptedString()
    println("This-> $str")
}