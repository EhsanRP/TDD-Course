package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;

/**
 * @author Ehsan Rostami Pour
 * @version 1.0
 * @date 7/12/2021 8:17 PM
 */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("Controllers")
public interface ControllerTests {

    @BeforeAll
    default void beforeAll(){
        System.out.println("Lets Test Controllers");
    }
}
