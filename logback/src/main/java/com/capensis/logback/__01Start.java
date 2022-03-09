package com.capensis.logback;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author wxg
 * @date 2022/3/7-15:15
 * @quotes 小不忍则乱大谋
 */
@SuppressWarnings("ALL")
public class __01Start {
    @Test
    public void test() {
        final Logger logger = LoggerFactory.getLogger(__01Start.class);
        for (int i = 0; i < 10; i++) {
            logger.debug("debug信息");
            logger.info("info信息");
            logger.warn("warn信息");
            logger.error("error信息");
            logger.trace("trace信息");
        }

        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("-------------------");

        // 确保主线程不要先于子线程结束
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMyLogger() {
        final Logger logger = LoggerFactory.getLogger(__01Start.class);
        logger.debug("debug信息");
        logger.info("info信息");
        logger.warn("warn信息");
        logger.error("error信息");
        logger.trace("trace信息");
    }

}
