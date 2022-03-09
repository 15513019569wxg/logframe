package com.capensis.jul;

import org.junit.Test;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * @author wxg
 * @date 2022/3/6-20:01
 * @quotes 小不忍则乱大谋
 */
@SuppressWarnings({"AlibabaClassNamingShouldBeCamel", "AlibabaTestClassShouldEndWithTestNaming", "DuplicatedCode"})
public class __03Log2File {
    @Test
    public void test04() throws IOException, InterruptedException {
        /*
         * 将日志输出到具体的磁盘文件中
         * 日志的持久化操作
         * */
        Logger logger = Logger.getLogger("com.capensis.jul.__03Log2File");

        logger.setUseParentHandlers(false);

        FileHandler fileHandler = new FileHandler("C:\\Users\\86187\\Desktop\\a.log");

        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);

        logger.addHandler(fileHandler);

        fileHandler.setLevel(Level.ALL);
        logger.setLevel(Level.ALL);

        for (int i = 0; i < 100; i++) {
            Thread.sleep(50);
            logger.log(Level.SEVERE, "SEVERE");
            logger.log(Level.WARNING, "WARNING");
            logger.log(Level.INFO, "INFO");
            logger.log(Level.CONFIG, "CONFIG");
            logger.log(Level.FINE, "FINE");
            logger.log(Level.FINER, "FINER");
            logger.log(Level.FINEST, "FINEST");
        }

    }
}
