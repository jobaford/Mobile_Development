//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {
    val user = User()
    with(user) {
        firstName = "Alex"
        lastName = "Dobinca"
    }
    with(user){
        println(firstName)
        println(lastName)
    }

}

class User{
    var firstName by FormatDelagate()
    var lastName by  FormatDelagate()
}

class FormatDelagate: ReadWriteProperty<Any?, String> {
    private var formattedString: String = ""

    override fun getValue(
        thisRef: Any?,
        property: KProperty<*>
    ): String{
        return formattedString
    }

    override fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        value: String
    ){
        formattedString = value.lowercase()
    }
}