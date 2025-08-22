//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val success = Result.Success("SUCCESS!")
    val error = Result.Error("FAILED!")
    val progress = Result.Progress("PROGRESS")
}

fun getData(result: Result){
    when(result){
        is Result.Error -> result.showMessage()
        is Result.Success -> result.showMessage()
        is Result.Progress -> result.showMessage()
    }
}

sealed class Result(val message: String){
    fun showMessage(){
        println("Result: $message")
    }
    class Success(message: String): Result(message)
    class Error(message: String): Result(message)
    class Progress(message: String): Result(message)
}