//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val listView = ListView(arrayOf("Name 1", "Name 2", "Name 3", "Name 4"))

    listView.ListViewItem().displayItem(2)
}

class ListView(val items: Array<String>){
    inner class ListViewItem(){

        fun displayItem(position: Int){
            println(items[position])
        }
    }
}

//output:

//Name 3