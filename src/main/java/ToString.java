import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * ClassName ToString
 * Description TODO lombok插件常用注解 @ToString 学习
 *
 * @author ZhangRenjie
 * Date  2020/12/6 11:34
 */
@lombok.ToString(exclude = {"age"},of = {"sex"})
public class ToString {
    private final String ID = "410702197211052011";
    private static String sex = "男";
    private String name;
    @Getter(AccessLevel.NONE)
    private Integer age;
}