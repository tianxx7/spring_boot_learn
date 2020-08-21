package com.txxc.durid.filters

import com.alibaba.druid.filter.FilterChain
import com.alibaba.druid.filter.FilterEventAdapter
import com.alibaba.druid.proxy.jdbc.ConnectionProxy
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.*

/**
 * @author seth
 * @version 1.0
 * Created by seth on 2020/8/16
 */
class ConnectionLogFilter : FilterEventAdapter() {
    private val logger: Logger = LoggerFactory.getLogger(ConnectionLogFilter::class.java)
    override fun connection_connectBefore(chain: FilterChain?, info: Properties?) {
        logger.info("BEFORE CONNECTION")
    }

    override fun connection_connectAfter(connection: ConnectionProxy?) {
        logger.info("AFTER CONNECTION")
    }
}