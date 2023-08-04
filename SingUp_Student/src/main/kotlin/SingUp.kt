fun SingUp(data: MutableList<MutableList<Any>>) {
    println("کد ملی خود را وارد نمایید")
    val nationalCode = readLine() ?: return
    println("اسم خود را وارد نمایید")
    val firstName = readLine() ?: return
    println("نام خوانوادگی خود را وارد نمایید")
    val lastName = readLine() ?: return
    println("سن خود را وارد نمایید")
    val age = readLine()?.toIntOrNull() ?: return
    println("مقطعی که میخاهید ثبت نام کنید را وارد نمایید")
    val maghtah = readLine() ?: return

    val personData = mutableListOf<Any>()
    personData.add(nationalCode)
    personData.add(firstName)
    personData.add(lastName)
    personData.add(age)
    personData.add(maghtah)

    data.add(personData)

    println("==================================")
    println("تبریک / شما با موفقیت ثبت نام شده اید")
    println("==================================")
}


