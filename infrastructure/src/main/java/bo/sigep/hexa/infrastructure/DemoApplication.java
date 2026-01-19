package bo.sigep.hexa.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDateTime;

@SpringBootApplication
@ComponentScan(basePackages = "bo.sigep.hexa")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        /*
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        LogErrorRepository bean = context.getBean(LogErrorRepository.class);
        LogErrorEntity entity = new LogErrorEntity(
                36000002L,
                "trace",
                "user",
                LocalDateTime.now(),
                "params");
        bean.save(entity);
        context.close();
         */

    }

}
