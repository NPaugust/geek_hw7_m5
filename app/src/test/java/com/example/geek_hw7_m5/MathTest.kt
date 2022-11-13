package com.example.geek_hw7_m5

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

   var math: Math? = null

    @Before
    fun setup(){

        math = Math()
    }

    @Test
    fun simpleAddTest(){

        assertEquals("4", math?.add("2","2"))
    }

    @Test
    fun simpleEmptyTest(){

        assertEquals("Поле не заполнено", math?.add("2",""))
    }

    @Test
    fun simpleTest(){

        assertEquals("7.0", math?.add("5.0","2.0"))
    }
    @Test
    fun zeroDoubleTest(){

        assertEquals("9.8", math?.add("4.2","5.6"))
    }
    @Test
    fun symbolAddTest(){
        assertEquals("Символ не складывается", math?.add("asadas","4"))
    }
    @Test
    fun intDoubleTest(){

        assertEquals("5.0", math?.add("2","3.0"))
    }
    @Test
    fun negativeAddTest(){

        assertEquals("Отрицательные числа не складываются", math?.add("2","-3"))
    }
    @Test
    fun simpledivideTest(){

        assertEquals("3", math?.divide("9","3"))
    }
    @Test
    fun zeroDivide(){

        assertEquals("Нельзя делить на ноль", math?.divide("6","0"))
    }
    @After
    fun detach(){

    math = null
}
}
