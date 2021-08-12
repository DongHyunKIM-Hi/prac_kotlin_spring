package com.example.demo

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CheckKotlinTest {

    fun checkElvis(a:Int?, b:Int?): Int{
        val num1 = a?:0
        val num2 = b?:0
        return num1+num2
    }

    fun checkDataFlow(){
        var ints = listOf(0,1,2,3)
        ints.forEach(fun(value: Int){
            if ( value == 1) return
            println(value)
        })
        println("end")
    }

    fun checkLambdaFlow(){
        var ints = listOf(0,1,2,3,4)

        println("with label")
        ints.forEach label@{
            if(it==1) return@label
            println(it)
        }
        println("without label")
        ints.forEach{
            if(it==1) return
            println(it)
        }
    }

    fun testforWhenCase(obj: Any): String = when(obj){
        1 -> "one"
        is Int -> "숫자임"
        "thing" -> "thing"
        is String -> "문자임"
        else -> "몰라요"
    }

    fun checkWhenCase(){
        val items = setOf("apple","kiwi","melon","banana")
        when{
            "apple" in items -> println("apple")
            "banana" in items -> println("banana")
        }
        items
            .filter { !it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach{ println(it)}
    }

    data class Person(var name:String = "익명", var age :Int = 0)




    @Test
    fun checkWhenCaseTest() = checkWhenCase()

    @Test
    fun checkElvisTest(){
        println(checkElvis(null,null))
    }
    @Test
    fun testforWhenCaseTest(){
        println(testforWhenCase(2))
    }
    @Test
    fun checkDataFlowTest()=checkDataFlow()

    @Test
    fun checkLambdaFlowTest() = checkLambdaFlow()
}