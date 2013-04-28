package com.example.jsfdemo.service;

import java.util.ArrayList;

import com.example.jsfdemo.domain.*;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AnimalManager {
	ArrayList<Animal> animals = new ArrayList<Animal>();
	
	public void addAnimal(Animal animal)
	{
		Animal newAnimal = new Animal();
		
		newAnimal.setId(animals.size());
		newAnimal.setName(animal.getName());
		newAnimal.setOwner(animal.getOwner());
		newAnimal.setSpecie(animal.getSpecie());
		
		animals.add(newAnimal);
	}
	
	public ArrayList<Animal> getAllAnimals()
	{
		return animals;
	}
}
