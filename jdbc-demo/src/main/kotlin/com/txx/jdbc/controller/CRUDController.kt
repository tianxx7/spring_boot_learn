package com.txx.jdbc.controller

import com.txx.jdbc.common.ResponseData
import com.txx.jdbc.service.CRUDService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author seth
 * @version 1.0
 * Created by seth on 2020/8/20
 */
@RestController
class CRUDController(val service: CRUDService) {

    @GetMapping("/get/count")
    fun getById(): ResponseData {
        return ResponseData.success(service.getFooCount())
    }
}