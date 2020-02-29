package com.example.accountmanager

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest<T> { 
    @Test
    fun addition_isCorrect() {
        var data = TestData()
//        for (i in 1..500){
//            println("<dimen name=\"dimen_" + i + "\">" + i + "dp</dimen>")
//        }
//        val list = listOf("1","2","3")
//        for (i in list.indices){
//            println("index $i content is ${list[i]}")
//        }
        assertEquals(4, 2 + 2)
    }
}
