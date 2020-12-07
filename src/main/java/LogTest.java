import lombok.extern.java.Log;

/**
 * ClassName LogTest
 * Description TODO lombok插件常用注解 @Log 学习
 *
 * @author ZhangRenjie
 * Date  2020/12/7 14:40
 */
@Log
public class LogTest {

    public void test(){
        log.info("日志");
        System.out.println("test");
    }
}