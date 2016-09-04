import java.util.*;
public class AnimalShelter{
  LinkedList<Animal> allAnimals = new LinkedList<Animal>();
  LinkedList<Animal> dogs = new LinkedList<Animal>();
  LinkedList<Animal> cats = new LinkedList<Animal>();

  public AnimalShelter(){}

  public void enqueue(Animal a){
    allAnimals.add(a);
    if(a.type == "Cat") this.cats.add(a);
    if(a.type == "Dog") this.dogs.add(a);
  }

  public Animal dequeueAny(){
    Animal toBeAdopted = this.allAnimals.removeFirst();
    if(toBeAdopted.type == "Cat") this.cats.remove(toBeAdopted);
    if(toBeAdopted.type == "Dog") this.dogs.remove(toBeAdopted);
    return toBeAdopted;
  }

  public Animal dequeueDog(){
    Animal dog = this.dogs.removeFirst();
    this.allAnimals.remove(dog);
    return dog;
  }

  public Animal dequeueCat(){
    Animal cat = this.cats.removeFirst();
    this.allAnimals.remove(cat);
    return cat;
  }

  public static void main(String[] args) {
    AnimalShelter shelter = new AnimalShelter();
    Animal dog1 = new Animal("Spot1", "Dog");
    Animal dog2 = new Animal("Spot2", "Dog");
    Animal cat1 = new Animal("Snickers1", "Cat");
    Animal cat2 = new Animal("Snickers2", "Cat");
    Animal dog3 = new Animal("Spot3", "Dog");
    shelter.enqueue(dog1);
    shelter.enqueue(dog2);
    shelter.enqueue(cat1);
    shelter.enqueue(cat2);
    shelter.enqueue(dog3);
    System.out.println(shelter.dequeueDog().name);
    System.out.println(shelter.dequeueAny().name);
    System.out.println(shelter.dequeueCat().name);
    System.out.println(shelter.dequeueCat().name);
  }
}
