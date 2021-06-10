package tacos;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {
    @NotNull
    @Size(min = 5,message = "Name must be at least 5 character long")
    private String name;
    @Size(min = 1,message = "You have to choose at least 1 ingridient")
    private List<String> ingredients;

}
