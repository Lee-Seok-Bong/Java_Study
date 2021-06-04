package polymorphism;

import java.util.ArrayList;
import java.util.Iterator;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 겉습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tigger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal hAnimal = new Human();
		Animal tAnimal = new Tigger();
		Animal eAnimal = new Eagle();
		
		//Eagle human = (Eagle)hAnimal;
		if(hAnimal instanceof Human) {
			System.out.println(hAnimal instanceof Human);
//			Human human = (Human)hAnimal;
//			human.readBooks();
		}
		
//		AnimalTest test = new AnimalTest();
//		test.moveAnial(hAnimal);
//		test.moveAnial(eAnimal);
//		test.moveAnial(tAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(eAnimal);
		animalList.add(tAnimal);
		animalList.add(hAnimal);
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
		
		/*for (Animal animal : animalList) {
			animal.move();
		}
		*/

	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for (int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			}else if (animal instanceof Tigger) {
				Tigger tigger = (Tigger)animal;
				tigger.hunting();
			}else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}else {
				System.out.println("Error");
			}
			
		}
	}
	
	public void moveAnial(Animal animal) {
		animal.move();
	}

}
