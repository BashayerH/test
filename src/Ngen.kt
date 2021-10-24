/*
class Ngen<T>(X: T) {

    init {
        println("we buy $X")
    }

    fun food(Item:T){
        println(Item )

    }
}


fun main(){
    val m=Ngen("Rise")
    m.food("fish")


}*/

//---------Generics---------
/*class Hats(val numHats:Int){
    fun getNumHat():Int{
        return numHats
    }
}

class LootBox <T:Hats>(val item:T){
    fun PrintItem(){
        val x =item as Hats

        println(x.getNumHat())
    }
}
fun main(){
   // val y= Hats(99) طريقة تعريف اخرى
    val x=LootBox(Hats(99))//طريقه تعريف
    x.PrintItem()//رجعلي الرفرنس لمكان الهات
}*/
//-----------------------

//fun adding(vararg item: Int){
//   var result=0
//   for (z in item.indices){
//      result = item[z]
//        println(result)
//   }
//}
//fun count(vararg number:Int){
//    for(x in number.indices) {
//        println(number[x])
//    }
//}
//
//fun main(){
//count(6,8,7,4,3,9,8,9)



   // adding(1,2,4,5,3)
//    val ii=IntArray(10)
//    ii[0]=5// طريقة متعبة
//    ii[1]=9
//    for (x in 0..ii.size-1){
//        ii[x]=9
//    }
//    for (zz in ii.indices){
//        println(ii[z])
//    }
//}
