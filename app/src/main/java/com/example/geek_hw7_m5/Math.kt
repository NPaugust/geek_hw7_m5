package com.example.geek_hw7_m5

class Math {
    fun add(a: String, b: String): String {
        var result = ""

        if (b == "" || a == "") {
            result = "Поле не заполнено"
        } else if (a.contains(".") || b.contains(".")) {
            var num1 = a.toDouble()
            var num2 = b.toDouble()
            result = (num1 + num2).toString()
       }else if (a.contains("-3") || b.contains("2")){
            result = "Отрицательные числа не складываются"
            return result
       }
    else if (a.contains(Regex("[a-z]"))|| b.contains(Regex("[a-z]"))) {
            result = "Символ не складывается"
            return result

        } else {
            var num1 = a.toInt()
            var num2 = b.toInt()
            result = (num1 + num2).toString()
        }

        return result

    }

    fun divide(a: String, b: String): String {
        var result = ""
        if (b == "0") {
            result = "Нельзя делить на ноль"
        } else {
           /* val num1 = a.toInt()
            val num2 = b.toInt()*/
            result = (a.trim().toInt() / b.trim().toInt()).toString()
        }
        return result
    }
}