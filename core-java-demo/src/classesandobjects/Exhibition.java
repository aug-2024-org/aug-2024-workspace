package classesandobjects;

public class Exhibition {
	
	public void exhibit(Animal animal) {
		animal.breathe();
		animal.mobile();
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
			dog.friendly();
			System.out.println(dog.leashColor);
		}else if(animal instanceof Snake) {
			Snake snake = (Snake)animal;
			snake.attacks();
		}
	}
//	public void exhibit(Dog dog) {
//		dog.mobile();
//		dog.breathe();
//		dog.friendly();
//	}
//	
//	public void exhibit(Snake snake) {
//		snake.mobile();
//		snake.breathe();
//		snake.attacks();
//	}
}
