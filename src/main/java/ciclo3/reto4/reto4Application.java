package ciclo3.reto4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"g26_package.ciclo3.modelo"})
public class reto4Application {

	public static void main(String[] args) {
		SpringApplication.run(reto4Application.class, args);
	}

}
