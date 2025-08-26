//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val loginButton = Button("Login", 1234, object: OnClickListener{
        override fun onClick() {

        }
    })

    val singnUpButton = Button("Sing Up", 2345, object: OnClickListener{
        override fun onClick() {

        }
    })
}

class Button(val text: String, val id: Int, onClickListener: OnClickListener)

class ClickListener(): OnClickListener{
    override fun onClick() {

    }
}

interface OnClickListener{
    fun onClick()
}