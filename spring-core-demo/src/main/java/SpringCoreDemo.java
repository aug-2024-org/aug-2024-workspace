import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybeans.Person;
import mybeans.Student;

public class SpringCoreDemo {

	public static void main(String[] args) {
		Person person1 = new Person("John", "Smith");
		System.out.println("person1 : " + person1);
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("anyName.xml");
		
		Person person2 = context.getBean("personBean", Person.class);
		System.out.println("person2 : " + person2);
		
		Person person3 = context.getBean("personBean1", Person.class);
		System.out.println("person3 : " + person3);
		
		Student student1 = context.getBean("student", Student.class);
		System.out.println("student1 : " + student1);
		
	}

}
