///*class Gen <T>(item:T) {
//    init {
//        println(item)
//    }
//
//    var box = mutableListOf<T>()
//
//    fun  addItem(newItem:T) {
//        box.add(newItem)
//    }
//}
//
//
//
//fun main(){
//    fun<Y> addItem(newItem: Y){
//        println(newItem)
//    }
//    val x=Gen(3)
//    x.addItem(3)
//}*/
//
//
class SuperMarket <T>(name:T,price:T) {
    var marketList: MutableMap<T, T> = mutableMapOf()

    fun Purchase(name: T, price: T) {
        marketList[name] = price

    }

    // i had problem with i in for I try to solve it in another way but nothing works so this line was
    //added by IDEA
    //val i = arrayOf(mutableMapOf<T,T>())
    operator fun get(i: MutableMap.MutableEntry<T, T>): MutableMap.MutableEntry<T, T> {
        return i
    }
}

fun main(){
    val item=SuperMarket("food",0.0)
   item.Purchase("fish",49.3)
    item.Purchase("orange",10.5)
   item.Purchase("braid",3.0)
    item.Purchase("olive",30.2)
   for (i in item.marketList){
       println(item[i])
    }
}
