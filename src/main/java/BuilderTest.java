import lombok.Builder;
import lombok.ToString;

/**
 * ClassName BuilderTest
 * Description TODO lombok插件常用注解 @Builder 学习
 *
 * @author ZhangRenjie
 * Date  2020/12/7 11:28
 */
@Builder
@ToString
public class BuilderTest {
    private String ID;
    private String sex;
    private String name;
    private Integer age;
}