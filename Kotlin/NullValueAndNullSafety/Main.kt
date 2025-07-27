//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val text: String? = null //the question mark is to assing null to the variable
    println(text) //will return null

    var text2: String? = "Name" //for this to work you must check if it is null first
    //text2 = null
    if (text2 != null){ //checking if null
        println(text2.length)
    }else{
        println("The variable is null.")
    }

    println(text2?.length) //this is equivalent to using if safe check of null
    println(text2!!.length) //this will throw an exception

    //Elvis operator ?:
    var text3: String? = null
    val text4 = text3 ?: "The variable is null." //if text2 is null assing "Some text." to text3
    println(text4)
}