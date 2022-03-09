package com.capensis.slf4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;



/**
 * @author wxg
 * @date 2022/3/7-14:41
 * @quotes 小不忍则乱大谋
 */
@SuppressWarnings("ALL")
public class __02LogRefactor {
    @Test
    public void test(){
        final Logger logger = LogManager.getLogger(__02LogRefactor.class);
        // 桥接之后,日志输出格式不再是log4j的定义的格式，而是转变为logback的输出格式
        logger.info("info信息");
    }
}
