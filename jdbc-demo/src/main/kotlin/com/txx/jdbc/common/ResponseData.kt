package com.txx.jdbc.common

/**
 * @author seth
 * @version 1.0
 * Created by seth on 2020/8/20
 */
class ResponseData {
    var code: Int = 200
    var data: Any? = null
    var msg: String? = ""

    companion object Instance {
        fun success(res: Any?) = ResponseData().apply { this.data = res }
        fun fail(res: Any?, msg: String?) = ResponseData().apply {
            this.code = 500
            this.msg = msg
            this.data = res
        }
    }
}