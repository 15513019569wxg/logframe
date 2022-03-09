package com.capensis.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @author wxg
 * @date 2022/3/6-23:23
 * @quotes 小不忍则乱大谋
 */
@SuppressWarnings({"AlibabaClassNamingShouldBeCamel", "AlibabaAvoidStartWithDollarAndUnderLineNaming", "AlibabaTestClassShouldEndWithTestNaming", "DuplicatedCode"})
public class __01Start {
    @Test
    public void test(){
        // 加载初始化配置
        BasicConfigurator.configure();

        final Logger logger = Logger.getLogger(__01Start.class);
        logger.info("info信息");
        logger.debug("debug信息");
        logger.warn("warn信息");
        logger.error("error信息");
        logger.fatal("fatal信息");
        logger.trace("trace信息");
    }
}
