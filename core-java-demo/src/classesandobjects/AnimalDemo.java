package classesandobjects;

public class AnimalDemo {

	public static void main(String[] args) {
//		Animal animal = new Animal("animal");
//		animal.breathe();
//		animal.mobile();
		System.out.println("-----------");
		
		Dog dog = new Dog("Lucifer Dog", "Black");
		dog.breathe();
		dog.mobile();
		dog.friendly();
		System.out.println("-----------");
		
		Snake snake = new Snake("Cobra Kai Snake");
		snake.breathe();
		snake.mobile();
		snake.attacks();
		System.out.println("-----------");

		Animal animal1 = new Dog("Lee Dog", "Red");
		animal1.breathe();
		animal1.mobile();
		//animal1.friendly();
		
		System.out.println("----------------");
		Exhibition exhibition = new Exhibition();
		exhibition.exhibit(animal1);
		exhibition.exhibit(dog);
		exhibition.exhibit(snake);
		
	}

}
