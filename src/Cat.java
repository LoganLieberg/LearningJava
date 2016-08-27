
public class Cat extends Animals {
	public Cat(){
		
	}
	
	public String makeSound(){
		return "meow";
	}
	
	public static void main(String[] args){
		Animals fido = new Dog();
		Animals fluffy = new Cat();
		//creating an array. it must have assigned size.
		Animals[] theAnimals = new Animals[10];
		
		theAnimals[0] = fido;
		theAnimals[1] = fluffy;
		
		System.out.println("fido says " + theAnimals[0].makeSound());
		System.out.println("fluffy says " + theAnimals[1].makeSound());
	}
}
