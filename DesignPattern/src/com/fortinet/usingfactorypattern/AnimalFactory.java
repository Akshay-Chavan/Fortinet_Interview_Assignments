package com.fortinet.usingfactorypattern;

import com.fortinet.animals.*;


public class AnimalFactory {
	
	public Animal getAnimal(String animal){
		
		if(animal == null){
			return null;
		}
		if(animal.equals("Dog")){
			return new Dog();
		}
		if(animal.equals("Cat")){
			return new Cat();
		}
		if(animal.equals("Horse")){
			return new Horse();
		}
		return null;
	}

}
