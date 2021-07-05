package guru.springframework.moneyProblem;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Setter
@Getter
@Value
@EqualsAndHashCode
public class Pair {
    String from;
    String to;

}
