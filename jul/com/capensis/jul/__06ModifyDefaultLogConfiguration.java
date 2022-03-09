package com.capensis.jul;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * @author wxg
 * @date 2022/3/6-21:28
 * @quotes 小不忍则乱大谋
 */
@SuppressWarnings({"AlibabaAvoidStartWithDollarAndUnderLineNaming", "AlibabaClassNamingShouldBeCamel", "DuplicatedCode", "AlibabaTestClassShouldEndWithTestNaming"})
public class __06ModifyDefaultLogConfiguration {
    @Test
    public void test() throws IOException {
        final FileInputStream fileInputStream = new FileInputStream("E:\\IDEAProject\\test\\logframe\\jul\\logging.properties");
        // 取得日志管理器对象
        final LogManager logManager = LogManager.getLogManager();
        // 读取自定义的日志配置文件
        logManager.readConfiguration(fileInputStream);

        final Logger logger = Logger.getLogger("com.capensis.jul.__06ModifyDefaultLogConfiguration");

        logger.log(Level.SEVERE, "SEVERE");
        logger.log(Level.WARNING, "WARNING");
        logger.log(Level.INFO, "INFO");
        logger.log(Level.CONFIG, "CONFIG");
        logger.log(Level.FINE, "FINE");
        logger.log(Level.FINER, "FINER");
        logger.log(Level.FINEST, "FINEST");

    }
}
