package com.fortinet.usingfactorypattern;

import com.fortinet.animals.Animal;

/*This is the class used to execute functionality for Dog, Cat and Horse classes. Because
 * we are using Factory design pattern here we do not need to change the code of this class
 * since the dependencies are injected for executing Dog, cat and Horse run() method. 
 * Hence this class is totally independent on the dependencies those are required to execute.
 * */
public class FactoryPatternDemo {
	
	Animal animal;
	
	public void setAnimal(Animal animal){
		this.animal = animal;
	}
	
	public void executeRun(){
		animal.run();
	}

}
