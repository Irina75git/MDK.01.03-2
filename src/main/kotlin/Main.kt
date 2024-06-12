package org.example

fun main() {
    // Задача 1
    println("Задача 1")
    val amount= 5_000_000
    val min=35
    println("Сумма перевода "+amount)
    var com =amount/100*0.75
    if(com<min){
        val per =amount-min
        println("Конечная сумма перевода " + per)
        println("Комиссия "+min)
    }
    else{
        val per1=amount-com
        println("Конечная сумма перевода " + per1)
        println("Комиссия "+com)
    }
    // Задача 2
    println("Задача 2")
    val likes=52
    val ost=likes%10
    if(ost===1){
        println("Нравиться "+ likes+" человеку")

    }
    else{
        println("Нравиться "+ likes+" людям")
    }
    // Задача 3
    println("Задача 3")
    val sum=15_000
    val post=false
    val skidka=100
    if(sum<1000)
    {
        val skid=sum/100*1
if(post==true){
    val sump=sum-skid
    println("Сумма платежа "+sump)
    println("Ваша скидка "+skid)

}
        else{
    println("Сумма платежа "+sum)
    println("Cкидка не предоставляется")
        }
    }
    else if (sum>1000&&sum<10_000)
    {
        val skid1=(sum-skidka)/100*1

        if(post==true){
val skid4=skid1+100
            val sump=sum-skid4
            println("Сумма платежа "+sump)
            println("Ваша скидка "+skid4)
        }
        else{
            val sump=sum-100
            println("Сумма платежа "+sump)
            println("Ваша скидка 100 ")
        }
    }
    else {
        val skid2=sum/100*5
        val skid3=skid2/100*1
        if(post==true){
            val sump=sum-skid3
            println("Сумма платежа "+sump)
            println("Ваша скидка "+skid3)
        }
        else{
            val sump=sum-skid2
            println("Сумма платежа "+sump)
            println("Ваша скидка "+skid2)
        }
    }

}