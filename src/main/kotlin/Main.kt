fun main(args: Array<String>) {

    /*  When a variable not defined with its type, after getting first value
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


}