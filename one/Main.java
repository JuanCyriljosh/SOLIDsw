package one;
public class Main {
    public static void main(String[] args){
        Pet aso = new Pet("Brownie A. Juan", "Pogi123");
        PetEat petEat = new PetEat();
        PetSound petSound=  new PetSound();

        petEat.eat(aso, "Medium rare Steak");
        petSound.makeSound(aso, "Munching");

    }
}