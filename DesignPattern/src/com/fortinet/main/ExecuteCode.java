package com.fortinet.main;


import com.fortinet.animals.*;
import com.fortinet.usingfactorypattern.AnimalFactory;
import com.fortinet.usingfactorypattern.FactoryPatternDemo;
import com.fortinet.withoutdesignpattern.SimpleRunDemo;

public class ExecuteCode {
	
	public static void main(String[] args) {
		
		//Execution using factory pattern
		
		System.out.println("Execution using factory pattern");
		AnimalFactory factory = new AnimalFactory();
		FactoryPatternDemo factoryDemo = new FactoryPatternDemo();
		Animal dog = factory.getAnimal("Dog");
		Animal cat = factory.getAnimal("Cat");
		Animal horse = factory.getAnimal("Horse");
		
		factoryDemo.setAnimal(dog);
		factoryDemo.executeRun();
		
		factoryDemo.setAnimal(cat);
		factoryDemo.executeRun();
		
		factoryDemo.setAnimal(horse);
		factoryDemo.executeRun();
		
		//Execution without using factory pattern.
		System.out.println("\nExecution without using design pattern");
		SimpleRunDemo simpleDemo = new SimpleRunDemo();
		simpleDemo.executeRun();
	}

}
