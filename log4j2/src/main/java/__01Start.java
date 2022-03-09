import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * @author wxg
 * @date 2022/3/10-0:15
 * @quotes 小不忍则乱大谋
 */
@SuppressWarnings({"AlibabaAvoidStartWithDollarAndUnderLineNaming", "AlibabaClassNamingShouldBeCamel", "AlibabaTestClassShouldEndWithTestNaming"})
public class __01Start {
    @Test
    public void test(){
        final Logger logger = LogManager.getLogger(__01Start.class);
        // 默认输出的日志级别是error
        logger.info("info信息");
        logger.debug("debug信息");
        logger.warn("warn信息");
        logger.error("error信息");
        logger.fatal("fatal信息");
        logger.trace("trace信息");
    }
}
