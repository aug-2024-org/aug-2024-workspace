import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mybeans.Person;
import mybeans.Student;

public class Demo {

	public static void main(String[] args) {
		Person person1 = new Person("Ron", "Weasley");
		System.out.println("person1 : " + person1);
		
		AnnotationConfigApplicationContext context 
			= new AnnotationConfigApplicationContext("mybeans");
		
		Person person2 = context.getBean("person", Person.class);
		System.out.println("person2 : " + person2);
		
		Student student1 = context.getBean("student", Student.class);
		System.out.println("student1o : " + student1);
		
	}

}
 