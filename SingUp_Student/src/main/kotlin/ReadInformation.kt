fun ReadInformation(data: MutableList<MutableList<Any>>) {
    println("کد ملی خود را وارد نمایید")
    val nationalCode = readLine() ?: return

    var found = false
    for (personData in data) {
        if (personData[0] == nationalCode) {
            println("کد ملی: ${personData[0]}")
            println("نام: ${personData[1]}")
            println("نام خانوادگی: ${personData[2]}")
            println("سن: ${personData[3]}")
            println("مقطع: ${personData[4]}")
            found = true
            break
        }
    }

    if (!found) {
        println("کد ملی وارد شده ثبت نشده است !!")
    }
}



