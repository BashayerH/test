//- Create an extension that replace repetative double characters in string (ex.: aa) to (**). ( optional )
//- Create an extension that prints any number value in reverse order.
fun main(){


   val ch= "name"
    ch.repetative("yaahbbdyy")

    }
fun String.repetative(name:String){

    if (name.repeat(name)){
        print("**")

    }
}

//fun Int.reverse(num:Int) {

   //(num.toString().reversed())
   // }


