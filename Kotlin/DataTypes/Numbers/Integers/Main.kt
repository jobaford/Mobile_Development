//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val number = 23

    val integerMaxValue = Int.MAX_VALUE //2147483647
    val integerMinValue = Int.MIN_VALUE //-2147483648
    println("Integer max value: $integerMaxValue")
    println("Integer min value: $integerMinValue")

    val byteMaxValue: Byte = Byte.MAX_VALUE //127
    val byteMinValue: Byte = Byte.MIN_VALUE //-128
    println("Integer max value: $byteMaxValue")
    println("Integer min value: $byteMinValue")

    val shortMaxValue: Short = Short.MAX_VALUE //32767
    val shortMinValue: Short = Short.MIN_VALUE //-32768
    println("Integer max value: $shortMaxValue")
    println("Integer min value: $shortMinValue")

    val longMaxValue: Long = Long.MAX_VALUE //9223372036854775807
    val longMinValue: Long = Long.MIN_VALUE //-9223372036854775808
    println("Integer max value: $longMaxValue")
    println("Integer min value: $longMinValue")

    val myNumber = 28L //this is long
}