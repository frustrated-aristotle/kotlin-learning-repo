import com.sun.jdi.Value
import java.util.HashMap
import kotlin.reflect.typeOf

fun main(args: Array<String>) {

    /*  When a variable not defined with its type after getting first value
        variable will automatically detect the suitable type for the variable
        and will give that type to variable.        */
    var a = 100
    /*  after that, if you try to give another type of value to the variable
        you will get an error
        a = 300000000 - This integer literal does not comfort to the expected type Int */

    /*  TYPE ANNOTATION
        We want to use var keyword to declare a variable but we can do want to prevent it becomes
        an int
        We use type annotation to prevent.
    */
    var b : Long = 100
    b = 30000000000

    //***********************FLOAT - DOUBLE

    //Dec's first value is a float value.
    var dec = 3.14f
    dec = 3.010101665f //print out 3.0101016
    //float only accepts 7 decimal digits

    //Double takes 16 decimal digits

    //Type conversion of val
    val intVal : Int = 10
    intVal.toDouble()
    val doubleA : Double = 5.12

    //Array list

    val javaArrayList = ArrayList<Any>()
    javaArrayList.add(true)
    javaArrayList.add(54)
    javaArrayList.add("SS")
    println("${javaArrayList.get(0)} and ${javaArrayList.get(1)}")

    var firstInt = 10
    var secondInt = 4

    //Set can not take duplicate elements
    val set1 = setOf<Any>(2,3,4, 4, 4, 4,4,55,true)
    println(set1)

    //We can not add elements to a set after declaration in that line
    //set1.add() there is no such thing

    //****************** HASH SET
    val hashSet1 = hashSetOf<Any>()
    //We do not need to initialize it
    //It has add method
    hashSet1.add(1)
    hashSet1.add(true)
    hashSet1.add(98)
    hashSet1.add("string huh");
    println(hashSet1);

    //**************** MAPS

    //A map works with key-value pair.
    //var mapName = hashMapOf<KeyType, ValueType>()

    var hashMap1 = hashMapOf<String, Int>()

    //Adding elements to hash can be done with put function instead of add.
    hashMap1.put("Key1", 1)
    hashMap1.put("Key2", 2)

    //Another way to do it:
    //We can initialize the map when declaring it as follows:
    //hashMapOf<KeyType, ValueType>(Key to Value, Key to Value)
    var hashMap2 = hashMapOf<String, Int>("Key1" to 1, "Key2" to 2)

    //Getting the element with its key from a has can be done as follows
    //mapName.get("Key1")

    println(hashMap1.get("Key1"))// prints out 1
    println(hashMap1) // prints out {Key2=2, Key1=1}

    var hashMap3 = hashMapOf<Int,ArrayList<String>>()

    var notes = ArrayList<String>()
    notes.add("first note")
    notes.add("second note")
    notes.add("third not")

    hashMap3.put(1, notes)
    println(hashMap3)



}