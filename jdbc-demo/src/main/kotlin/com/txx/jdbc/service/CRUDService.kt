package com.txx.jdbc.service

import com.txx.jdbc.dao.FooDao
import org.springframework.stereotype.Service

/**
 * @author seth
 * @version 1.0
 * Created by seth on 2020/8/20
 */
@Service
class CRUDService(val fooDao: FooDao) {

    fun getFooCount(): Long {
        return fooDao.getFooCount()
    }
}