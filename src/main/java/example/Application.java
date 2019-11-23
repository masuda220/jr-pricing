package example;

import com.fasterxml.jackson.databind.ObjectMapper;
import example._configuration.CustomObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * メイン
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ObjectMapper directFieldAccess() {
        ObjectMapper mapper = new CustomObjectMapper().ofDirectFieldAccess();
        return mapper;
    }
}
