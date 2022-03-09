package com.capensis.jul;

import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author wxg
 * @date 2022/3/6-18:03
 * @quotes 小不忍则乱大谋
 */
public class JulTest {
    private static final Logger logger = Logger.getLogger("com.capensis.com.JulTest");
    @Test
    public void test01() {
        /* 对于日志的输出方式有两种
         * 第一种方式直接调用对应级别的相关方法，方法中传递日志输出信息
         * 假设我们现在要info级别的日志

         * 第二种方法，
         * 调用log方法,然后在level来定义日志的级别
         * */
        logger.info("info");
        logger.log(Level.INFO, "输出info的信息");

        String name = "haoran";
        int age = 1;
        logger.log(Level.INFO, "name={0},age={1}", new Object[]{name, age});
    }
}
