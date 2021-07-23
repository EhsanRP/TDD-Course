package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelRepeatedTest;
import guru.springframework.sfgpetclinic.ModelRepeatedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

/**
 * @author Ehsan Rostami Pour
 * @version 1.0
 * @date 7/23/2021 4:22 PM
 */

public class PersonRepeatedTest implements ModelRepeatedTest {

    @DisplayName("Repeated Test")
    @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} / {totalRepetitions}")
    void repeatedTest() {
    }

    @DisplayName("Repeated Test With DI")
    @RepeatedTest(5)
    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        //TODO - IMPL

    }

    @RepeatedTest(value = 5 , name = "{displayName}: {currentRepetition} / {totalRepetitions}")
    @DisplayName("My assignment repeated test")
    void myAssignmentRepeated() {
        //TODO IMPL
    }
}
