fun main() {

    val data = mutableListOf<MutableList<Any>>()

    while (true) {
        println("[1] ثبت نام")
        println("[2] ورود / خواندن اطلاعات کاربر")
        println("[3] حذف حساب کاربری")
        println("[0] خروج از سیستم")
        println("یکی از درخواست های بالا را انتخاب کنید")
        val menu = readLine()?.toIntOrNull() ?: continue
        when (menu) {
            1 -> SingUp(data)
            2-> ReadInformation(data)
            3 -> RemoveUser(data)
            0 ->  return
            else ->  println("عدد وارد شده نامعتبر میباشد ")
        }
    }
}




