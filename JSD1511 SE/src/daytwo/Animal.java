package daytwo;

public class Animal {
	public String noise() {
		 return "Animal";
	}
   public static void main(String[] args) {
   	 Cat cat = new Cat();
		 Animal animal = new Dog();
		 if (animal instanceof Cat) {		
		    cat = (Cat) animal;
		    System.out.println(cat.noise());
	
		   } else {
			   System.out.println("animal is not Cat's instance");  
		   }         
   }
}
class Dog extends Animal {
	public String noise() {
		   return "Dog";
		  }
} 
class Cat extends Animal {
	public String noise(){
		return "Cat";
	}
}
		 
