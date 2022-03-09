package com.capensis.jul;

import org.junit.Test;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * @author wxg
 * @date 2022/3/6-20:49
 * @quotes 小不忍则乱大谋
 */
@SuppressWarnings({"AlibabaAvoidStartWithDollarAndUnderLineNaming", "AlibabaClassNamingShouldBeCamel", "AlibabaTestClassShouldEndWithTestNaming", "DuplicatedCode"})
public class __05LogParentAndChildren {
    @Test
    public void test06(){
        // 父亲是RootLogger, 名称默认是一个空的字符串
        Logger logger1 = Logger.getLogger("com.capensis.jul");
        // RootLogger可以被称为所有logger对象的顶层logger
        Logger logger2 = Logger.getLogger("com.capensis.jul.__05LogParentAndChildren");

        System.out.println(logger2.getParent() == logger1);

        System.out.println("logger1名称为" + logger1.getName() + ";  logger1的父Logger引用为"
                + logger1.getParent() +  ";  logger1的父logger的名称为" + logger1.getParent().getName());
        System.out.println("logger2名称为" + logger2.getName() + ";  logger2的父Logger引用为"
                + logger2.getParent() +  ";  logger2的父logger的名称为" + logger2.getParent().getName());

        /*
            父亲所做的设置，也能够同时作用于儿子。对logger1做日志打印相关的设置，然后我们使用logger2进行日志的打印
         */
        logger1.setUseParentHandlers(false);
        // 设置日志格式
        final ConsoleHandler consoleHandler = new ConsoleHandler();
        final SimpleFormatter simpleFormatter = new SimpleFormatter();
        consoleHandler.setFormatter(simpleFormatter);

        // 设置日志级别
        logger1.addHandler(consoleHandler);
        logger1.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);

        logger2.log(Level.WARNING, "WARNING");
        logger2.log(Level.INFO, "INFO");
        logger2.log(Level.CONFIG, "CONFIG");
        logger2.log(Level.FINE, "FINE");
        logger2.log(Level.FINER, "FINER");
        logger2.log(Level.FINEST, "FINEST");
        logger2.log(Level.SEVERE, "SEVERE");

    }
}
