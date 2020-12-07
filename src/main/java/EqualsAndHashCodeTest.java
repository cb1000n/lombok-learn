import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * ClassName EqualsAndHashCodeTest
 * Description TODO lombok插件常用注解 @EqualsAndHashCode 学习
 *
 * @author ZhangRenjie
 * Date  2020/12/6 11:34
 */
@EqualsAndHashCode(of = {"ID"})
public class EqualsAndHashCodeTest {
    private final String ID = "410702197211052011";
    private static String sex = "男";
    private String name;
    private Integer age;
}