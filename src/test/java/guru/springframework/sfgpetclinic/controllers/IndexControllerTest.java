package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Ehsan Rostami Pour
 * @version 1.0
 * @date 7/11/2021 4:53 PM
 */
class IndexControllerTest {

    IndexController indexController;

    @BeforeEach
    void setUp() {
        indexController = new IndexController();
    }

    @DisplayName("Testing for proper view names")
    @Test
    void index() {
        assertEquals("index", indexController.index(),
                "Wrong View Returned");
    }

    @DisplayName("Test exception message")
    @Test
    void oupsHandler() {
        assertTrue("notimplemented".equals(indexController.oupsHandler()), () -> "This is some expensive messages");
    }

    @DisplayName("Test exception")
    @Test
    void throwableException() {
        assertThrows(ValueNotFoundException.class, () -> {
            indexController.throwableException();
        });
    }
}