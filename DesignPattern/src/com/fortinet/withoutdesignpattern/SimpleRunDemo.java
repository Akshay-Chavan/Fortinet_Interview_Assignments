package com.fortinet.withoutdesignpattern;

import com.fortinet.animals.*;

/*Similar to FactoryPatternDemo class this class is also used to execute the functionalities 
 * of Dog, Cat and Horse classes. The major difference between FactoryPatternDemo and this class  
 * is the code within this class will always have to be changed in order to execute run() method of any
 * of the Dog, Cat or Horse classes. This is because the dependencies are not injected into
 * this class, even if we make use of polymorphism, we need to create a new Dog, Cat or Horse Object. */
public class SimpleRunDemo {
	
	public void executeRun(){
		Animal dog = new Dog();
		runAnimal(dog);
		
//		The code commented below will have to be added in this class if we need to execute
//		run() method for Cat or Horse classes unlike the FactoryPatternDemo class.
//		Animal cat = new Cat();
//		runAnimal(cat);
//		
//		Animal horse = new Horse();
//		runAnimal(horse);
	}
	
	public void runAnimal(Animal animal){
		animal.run();
	}

}
