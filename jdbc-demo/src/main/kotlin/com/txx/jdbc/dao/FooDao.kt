package com.txx.jdbc.dao

import com.txx.jdbc.common.Foo
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

/**
 * @author seth
 * @version 1.0
 * Created by seth on 2020/8/20
 */
@Repository
class FooDao(val jdbcTemplate: JdbcTemplate) {

    /**
     * 获取总数
     */
    fun getFooCount(): Long {
        //这里只能用java的class 不能使用kotlin的Long:class
        val count = jdbcTemplate.queryForObject("select count(*) from FOO", Long::class.java)
        println(count)
        return count!!
    }

    /**
     * 插入一个foo
     */
    fun addFoo(foo: Foo) {

    }

    /**
     * 插入一堆foo
     */
    fun addFooList(fooList: List<Foo>) {

    }

    /**
     * 修改一个foo
     */
    fun updateFoo(foo: Foo) {

    }

    /**
     * 删除一个foo
     */
    fun deleteFooById(id: Long) {

    }

}