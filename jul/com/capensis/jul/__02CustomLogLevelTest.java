package com.capensis.jul;

import org.junit.Test;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * @author wxg
 * @date 2022/3/6-19:50
 * @quotes 小不忍则乱大谋
 */
@SuppressWarnings({"DuplicatedCode", "AlibabaClassNamingShouldBeCamel"})
public class __02CustomLogLevelTest {
    @Test
    public void test03(){
        //日志记录器
        Logger logger = Logger.getLogger("com.capensis.jul.__02CustomLogLevelTest");
        //讲默认的日志级别关闭掉
        logger.setUseParentHandlers(false);
        //处理器handler
        ConsoleHandler consoleHandler = new ConsoleHandler();
        //创建格式化器
        SimpleFormatter simpleFormatter = new SimpleFormatter();

        //在处理器中设置输出格式
        consoleHandler.setFormatter(simpleFormatter);

        //在记录器中添加处理器
        logger.addHandler(consoleHandler);

        //日志的打印级别
        //此处需要将日志记录器和处理器的级别进行统一的设置，才会达到日志显示相应的级别效果
        logger.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);

        logger.log(Level.SEVERE, "SEVERE");
        logger.log(Level.WARNING, "WARNING");
        logger.log(Level.INFO, "INFO");
        logger.log(Level.CONFIG, "CONFIG");
        logger.log(Level.FINE, "FINE");
        logger.log(Level.FINER, "FINER");
        logger.log(Level.FINEST, "FINEST");
    }
}
