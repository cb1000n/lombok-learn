import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * ClassName RequiredArgsConstructorTest
 * Description TODO lombok插件常用注解 @RequiredArgsConstructor 学习
 *
 * @author ZhangRenjie
 * Date  2020/12/7 10:10
 */
@RequiredArgsConstructor
public class RequiredArgsConstructorTest {

    final private String ID;
    @NonNull private String sex;
    private String name;
    private Integer age;
}