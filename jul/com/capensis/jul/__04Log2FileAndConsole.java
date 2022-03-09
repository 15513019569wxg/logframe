package com.capensis.jul;

import org.junit.Test;

import java.io.IOException;
import java.util.logging.*;

/**
 * @author wxg
 * @date 2022/3/6-20:30
 * @quotes 小不忍则乱大谋
 */
@SuppressWarnings({"AlibabaClassNamingShouldBeCamel", "DuplicatedCode", "AlibabaTestClassShouldEndWithTestNaming"})
public class __04Log2FileAndConsole {
    @Test
    public void test05() throws IOException, InterruptedException {
        Logger logger1 = Logger.getLogger("com.capensis.jul.__04Log2FileAndConsole");
        logger1.setUseParentHandlers(false);

        // 控制台
        ConsoleHandler consoleHandler = new ConsoleHandler();
        // 文件
        FileHandler fileHandler = new FileHandler("C:\\Users\\86187\\Desktop\\a.log");
        // 日志格式
        SimpleFormatter formatter = new SimpleFormatter();
        // 设置控制台和文件的日志格式
        fileHandler.setFormatter(formatter);
        consoleHandler.setFormatter(formatter);
        // 加入logger1
        logger1.addHandler(fileHandler);
        logger1.addHandler(consoleHandler);
        // 设置日志级别
        fileHandler.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);
        logger1.setLevel(Level.ALL);

        for (int i = 0; i < 100; i++) {
            Thread.sleep(500);
            logger1.log(Level.SEVERE, "SEVERE");
            logger1.log(Level.WARNING, "WARNING");
            logger1.log(Level.INFO, "INFO");
            logger1.log(Level.CONFIG, "CONFIG");
            logger1.log(Level.FINE, "FINE");
            logger1.log(Level.FINER, "FINER");
            logger1.log(Level.FINEST, "FINEST");
        }


    }
}
