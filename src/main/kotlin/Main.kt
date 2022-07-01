import java.util.Scanner
import kotlin.math.truncate

fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите сумму покупки (в рублях):")
    val sum = ((scanner.nextLine().toFloat())*100).toInt()

    val boughtBefore = true

    val result = if (sum in 1001_00..10_000_00) sum - 10000 else{
        if (sum >= 10001_00) (sum * 0.95).toInt() else sum
    }

    if (!boughtBefore) println("Общая стоимость составляет ${result.toFloat()/100}")
    else println("Общая стоимость с учётом доп. скидки как постоянному клиенту составляет ${truncate(result*0.99)/100}")

}