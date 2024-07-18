package DataType;

public class Animal {
       String name;
       String colour;
       int length;
       
       void sound() {
    	   System.out.println("sound of animal");
       }
       void run() {
    	   System.out.println("animal is running");
       }


public static void main(String[] args) {
	Animal dog = new Animal();
	dog.name = "Regun";
	dog.colour="Black";
	dog.length=2;
	dog.sound();
	dog.run();
	System.out.println(dog.name);
	System.out.println(dog.colour);
}
	
	
}