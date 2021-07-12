package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Ehsan Rostami Pour
 * @version 1.0
 * @date 7/11/2021 5:02 PM
 */

class PersonTest implements ModelTests {

    @Test
    void groupedAssertions() {

        //Given
        var person = new Person(1l, "Joe", "Buck");

        //Then
        assertAll("Test Props Set",
                () -> assertEquals("Joe", person.getFirstName()),
                () -> assertEquals("Buck", person.getLastName()));
    }

    @DisplayName("Repeated Test")
    @RepeatedTest(value = 10 , name = "{displayName} : {currentRepetition} / {totalRepetitions}")
    void repeatedTest() {
        System.out.println("repeated Test");
        //TODO - IMPL
    }
}