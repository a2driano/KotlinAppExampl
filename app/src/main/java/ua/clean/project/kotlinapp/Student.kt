package ua.clean.project.kotlinapp

/**
 * Created by kunde on 11.12.2017.
 */
class Student constructor(name: String, age: Int, var sex: Boolean) : Human(name, age) {

    fun sum(i: Int): Int {
        return i
    }

    fun sum(name: String) {
        if (age < 3) {
        } else {
        }
    }

    fun comp(a: Int, b: Int) = if (a > b) a else b

    fun sum(x: Int, y: Int) = x + y + age

    override
    fun studentIsBlack(): Boolean {
        return true
    }






}




