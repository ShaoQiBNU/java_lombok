import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User2 {
    private String id;
    private String name;
    private Integer age;
}