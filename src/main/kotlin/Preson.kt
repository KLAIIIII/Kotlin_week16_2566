abstract class Person(name:String){
    private var perName: String = name
    abstract var perAge:Int

//    init {
//        this.perName = name
//    }

    abstract fun setPersonAge(age:Int)
    abstract fun getPersonAge():Int

    fun getPersonName(){
        println("Name = $perName")
    }
}

class Employee(perName:String):Person(perName){
    override var perAge:Int = 0

    override fun setPersonAge(age:Int){
        perAge = age
    }
    override fun getPersonAge():Int{
        return perAge
    }
}