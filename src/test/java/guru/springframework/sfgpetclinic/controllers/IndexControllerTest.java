package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.springdatajpa.OwnerSDJpaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

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

    @Disabled
    @Test
    void testTimeOut() {
        assertTimeout(Duration.ofMillis(100),() -> Thread.sleep(5000));

        System.out.println("i got here");
    }

    @Disabled
    @Test
    void testTimeOutPremt() {
        assertTimeoutPreemptively(Duration.ofMillis(100),() -> Thread.sleep(5000));

        System.out.println("i got here 2");

    }
}