import Password.Encrypt

fun main(arg: Array<String>) {
    var str = readLine()
    val encrypt = Encrypt(str!!)
    str = encrypt.getString()
    println("This-> $str")
    str = encrypt.getEncryptedString()
    println(str)
    val str1 = encrypt.generateHash(str!!)
    println(str1)
    print(encrypt.checkSum(str, str1!!))
}