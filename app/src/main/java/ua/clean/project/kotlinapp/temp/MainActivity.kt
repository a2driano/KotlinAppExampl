package ua.clean.project.kotlinapp.temp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ua.clean.project.kotlinapp.R

class MainActivity : AppCompatActivity() {

    var student = Student("sdf", 16, true)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        student.studentIsBlack()


        val listItem = listOf("Str1", "Str2", "Str3")

        for (item in listItem) {

        }

        val items = listOf("apple", "banana", "kiwi")
        for (index in items.indices) {
            println("item at $index is ${items[index]}")
        }

        while (listItem.size < 2) {
            println("wtf")
        }

        var index = 0
        while (index < items.size) {
            println("item at $index is ${items[index]}")
            index++
        }


        describe(34)

        if (index in 1..10) {
        }



        var list = listOf("a", "b", "c")

        if (-1 !in 0..list.lastIndex) {
            println("-1 is out of range")
        }
        if (list.size !in list.indices) {
            println("list size is out of valid list indices range too")
        }




        for (x in 1..10 step 2) {
            print(x)
        }


    }

    fun describe(obj: Any): String =
            when (obj) {
                1 -> "One"
                "Hello" -> "Greeting"
                is Long -> "Long"
                !is String -> "Not a string"
                else -> "Unknown"
            }
}
