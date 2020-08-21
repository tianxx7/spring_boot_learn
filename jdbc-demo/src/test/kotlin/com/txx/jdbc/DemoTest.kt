package com.txx.jdbc

/**
 * @author seth
 * @version 1.0
 * Created by seth on 2020/8/21
 */
fun main() {
    println(Long::class) // kotlin.long  通过类来获取
    println(Long::class.java) //long   通过类来获取
    println(1L.javaClass)// 相当于 obj.getClass()  通过实例来获取Class
}