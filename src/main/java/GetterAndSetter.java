import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * ClassName LombokLearn
 * Description TODO lombok插件常用注解 @Getter/@Setter 学习
 * @author ZhangRenjie
 * date 2020/12/6 10:41
 */
@Getter(AccessLevel.PROTECTED)
@Setter
public class GetterAndSetter {
    private final String ID = "410702197211052011";
    private static String sex = "男";
    private String name;
    @Getter(AccessLevel.NONE)
    private Integer age;
}