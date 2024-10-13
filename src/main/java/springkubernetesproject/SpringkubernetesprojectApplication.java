package springkubernetesproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class SpringkubernetesprojectApplication {
	
	@RequestMapping("/")
	public String home() {
		return "Hello Friends";
	}


	public static void main(String[] args) {
		
	
		
		SpringApplication.run(SpringkubernetesprojectApplication.class, args);
		System.out.println("Hello Kubernetes and Docker");
		System.out.println("I am learning DevOps and cloud");
		
		
	}

}
