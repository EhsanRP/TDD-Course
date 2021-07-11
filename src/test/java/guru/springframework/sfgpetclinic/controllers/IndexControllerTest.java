package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.springdatajpa.OwnerSDJpaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
import org.junit.platform.commons.util.ReflectionUtils;

import java.lang.reflect.Method;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

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

    @Test
    void testAssuption() {
        assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
    }

    @Test
    void testAssuptionTrue() {
        assumeTrue("GURU".equalsIgnoreCase("GURU"));
    }

    @EnabledOnOs(OS.MAC)
    @Test
    void testOnMacOs() {
        System.out.println(System.getProperty("os.name"));
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testOnWindows() {
        System.out.println(System.getProperty("os.name"));
    }

    @EnabledOnOs(OS.LINUX)
    @Test
    void testOnLinux() {
        System.out.println(System.getProperty("os.name"));
    }

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void testOnLJava8() {

    }

    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testOnLJava11() {

    }

    @EnabledIfEnvironmentVariable(named = "NUMBER_OF_PROCESSORS",matches = "8")
    @Test
    void testOnProcessors8() {

    }

    @EnabledIfEnvironmentVariable(named = "NUMBER_OF_PROCESSORS",matches = "6")
    @Test
    void testOnProcessors6() {

    }
}