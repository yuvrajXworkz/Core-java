package com.xworkz.hasa;

public class AnimalTester {
    public static void main(String[] args) {

       // Animal ani=new Animal();
      //  ani.Sound();
      // Dog dog=new Dog();
      //  dog.Sound();
//run time polymorphism //up casting
        Animal animal = new Dog();
        animal.Sound();

        //down casting

                Dog dog=(Dog)animal;
                dog.run();



    }
}
