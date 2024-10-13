package springkubernetesproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringkubernetesprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringkubernetesprojectApplication.class, args);
		System.out.println("Hello Kubernetes and Docker");
		
	}

}
