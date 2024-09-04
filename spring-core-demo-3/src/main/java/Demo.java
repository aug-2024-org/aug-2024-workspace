import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mybeans.Person;
import mybeans.Student;

public class Demo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Person person1 = context.getBean("person", Person.class);
		System.out.println("person1 : " + person1);
		
		Student student1 = context.getBean("student", Student.class);
		System.out.println("student1 : " + student1);
		
	}

}
