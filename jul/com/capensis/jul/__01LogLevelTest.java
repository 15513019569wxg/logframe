package com.capensis.jul;

import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author wxg
 * @date 2022/3/6-19:37
 * @quotes 小不忍则乱大谋
 */
@SuppressWarnings({"AlibabaClassNamingShouldBeCamel", "DuplicatedCode"})
public class __01LogLevelTest {
    private static final Logger logger = Logger.getLogger("com.capensis.jul.__01LogLevelTest");
    @Test
    public void test02(){
        /*
         * SEVERE:(最高级)错误级别
         * WARNING:警告级别
         * INFO:(默认级别)消息级别
         * CONFIG:配置级别
         * FINE: 详细信息（少）
         * FINER: 详细信息（中）
         * FINEST: 详细信息 (高)
         *
         * 特殊的两个级别
         * OFF 关闭所有的日志消息记录
         * ON 启动所有的日志消息记录
         * */

        /* logger.setLevel(Level.ALL); */
        logger.log(Level.SEVERE, "SEVERE");
        logger.log(Level.WARNING, "WARNING");
        logger.log(Level.INFO, "INFO");
        logger.log(Level.CONFIG, "CONFIG");
        logger.log(Level.FINE, "FINE");
        logger.log(Level.FINER, "FINER");
        logger.log(Level.FINEST, "FINEST");
    }

}
