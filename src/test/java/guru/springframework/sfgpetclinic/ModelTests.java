package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;

/**
 * @author Ehsan Rostami Pour
 * @version 1.0
 * @date 7/12/2021 8:18 PM
 */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("Model")
public interface ModelTests {

    @BeforeAll
    default void beforeAll(){
        System.out.println("Lets Test Models");
    }
}
