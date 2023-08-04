
fun RemoveUser(data: MutableList<MutableList<Any>>) {
    println("کد ملی خود را وارد نمایید")
    val nationalCode = readLine() ?: return

    var found = false
    for (i in data.indices) {
        if (data[i][0] == nationalCode) {
            data.removeAt(i)
            found = true
            break
        }
    }

    if (found) {
        println("اطلاعات کاربر با کد ملی $nationalCode با موفقیت حذف شد.")
    } else {
        println("کد ملی وارد شده ثبت نشده است !!")
    }
}

