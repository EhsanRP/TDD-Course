package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void  beforeAll(){
        System.out.println("In Before All");
    }

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
        System.out.println("In Before Each.............");

    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Ehsan"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each.............");
    }

    @AfterAll
    public static void  afterAll(){
        System.out.println("In After All");
    }
}