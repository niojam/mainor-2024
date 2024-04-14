package ee.mainor.demo.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class GreetingServiceTest {

    private final GreetingService greetingService = new GreetingService();

    @Test
    public void shouldReturnParameterWithHelloPrefix() {
        String name = "Name";
        String actual = greetingService.sayHello(name);
        String expected = "Hello " + name;
        assertThat(actual).isEqualTo(expected);
    }

}