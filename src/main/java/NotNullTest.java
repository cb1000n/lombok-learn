import com.sun.istack.internal.NotNull;
import lombok.NonNull;

/**
 * ClassName NotNullTest
 * Description TODO lombok插件常用注解 @NotNull 学习
 *
 * @author ZhangRenjie
 * Date  2020/12/7 9:54
 */
public class NotNullTest {

    public void test(@NonNull String s){
        System.out.println(s);
    }
}