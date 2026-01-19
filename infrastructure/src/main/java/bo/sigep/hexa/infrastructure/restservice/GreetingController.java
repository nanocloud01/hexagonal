package bo.sigep.hexa.infrastructure.restservice;

import java.util.concurrent.atomic.AtomicLong;

import bo.sigep.hexa.application.MyApplication;
import bo.sigep.hexa.domain.MyDomain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(defaultValue = "World") String name) {

        MyApplication ma = new MyApplication();
        ma.print();

        MyDomain md = new MyDomain();
        md.print();

        return new Greeting(counter.incrementAndGet(), template.formatted(name));
    }

}
