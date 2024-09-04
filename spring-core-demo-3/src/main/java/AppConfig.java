import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mybeans.Address;
import mybeans.Person;
import mybeans.Student;

@Configuration
public class AppConfig {
	
	@Bean
	public Person person() {
		return new Person("Albus", "Dumbledore");
	}
	
	@Bean
	public Address address() {
		return new Address("Bangalore", "KT");
	}
	
	@Bean
	public Student student() {
		return new Student("Potter", 60, address());
		
	}
}
