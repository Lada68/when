fun main() {
    agoToText(72900)
}

fun agoToText(i: Int) {
    when (true) {
        i in 1..60 -> println("Был(а) только что").toString()
        i in 61..3600 -> minutesChange(i)
        i in 3601..86400 -> hoursesChange(i)
        i in 86401..172800 -> println("Был(а) сегодня").toString()
        i in 172801..345600 -> println("Был(а) вчера").toString()
        else -> println("Был(а) давно").toString()
    }

}

fun minutesChange(i: Int) {
    when (true) {
        (i / 60) % 10 == 1 -> println("Был(а) " + i / 60 + " минуту назад").toString()
        (i / 60) % 10 == 2 -> println("Был(а) " + i / 60 + " минуты назад").toString()
        (i / 60) % 10 == 3 -> println("Был(а) " + i / 60 + " минуты назад").toString()
        (i / 60) % 10 == 4 -> println("Был(а) " + i / 60 + " минуты назад").toString()
        else -> println("Был(а) " + i / 60 + " минут назад").toString()
    }
}

fun hoursesChange(i: Int) {
    when (true) {
        (i / 3600) % 10 == 1 -> println("Был(а) " + i / 3600 + " час назад").toString()
        (i / 3600) % 10 == 2 -> println("Был(а) " + i / 3600 + " часа назад").toString()
        (i / 3600) % 10 == 3 -> println("Был(а) " + i / 3600 + " часа назад").toString()
        (i / 3600) % 10 == 4 -> println("Был(а) " + i / 3600 + " часа назад").toString()
        else -> println("Был(а) " + i / 3600 + " часов назад").toString()

    }
}

