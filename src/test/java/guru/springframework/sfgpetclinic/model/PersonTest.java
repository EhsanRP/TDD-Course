package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Ehsan Rostami Pour
 * @version 1.0
 * @date 7/11/2021 5:02 PM
 */
class PersonTest {

    @Test
    void groupedAssertions() {

        //Given
        var person = new Person(1l, "Joe", "Buck");

        //Then
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Joe"),
                () -> assertEquals(person.getLastName(),"Buck"));
    }

}