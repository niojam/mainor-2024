package ee.mainor.demo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String sayHello(String name) {
        return String.format("Hello %s", name);
    }


}
