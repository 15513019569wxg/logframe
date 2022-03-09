package com.capensis.log4j;

import org.apache.log4j.helpers.LogLog;
import org.junit.Test;
import org.apache.log4j.Logger;


/**
 * @author wxg
 * @date 2022/3/6-23:57
 * @quotes 小不忍则乱大谋
 */
@SuppressWarnings({"unused", "AlibabaClassNamingShouldBeCamel", "AlibabaAvoidStartWithDollarAndUnderLineNaming", "DuplicatedCode", "AlibabaTestClassShouldEndWithTestNaming"})
public class __02CustomConfig {
    @Test
    public void test() throws InterruptedException {
        // 打开记录日志的日志Loglog
        LogLog.setInternalDebugging(true);
        final Logger logger = Logger.getLogger(__01Start.class);
        logger.info("info信息");
        logger.debug("debug信息");
        logger.warn("warn信息");
        logger.error("error信息");
        logger.fatal("fatal信息");
        logger.trace("trace信息");

        final Logger loggerApache = Logger.getLogger(Logger.class);
        loggerApache.info("info信息-----");
        loggerApache.debug("debug信息-----");
        loggerApache.warn("warn信息-----");
        loggerApache.error("error信息-----");
        loggerApache.fatal("fatal信息-----");
        loggerApache.trace("trace信息-----");
    }
}
