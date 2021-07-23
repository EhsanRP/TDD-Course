package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.*;

/**
 * @author Ehsan Rostami Pour
 * @version 1.0
 * @date 7/23/2021 4:23 PM
 */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("Model")
public interface ModelRepeatedTest {


    @BeforeEach
    default void beforeEachConsoleOutput(TestInfo testInfo, RepetitionInfo repetitionInfo){
        System.out.println("Running Test - " + testInfo.getDisplayName() + " - " + repetitionInfo.getCurrentRepetition() + "/" + repetitionInfo.getTotalRepetitions());
    }


}
