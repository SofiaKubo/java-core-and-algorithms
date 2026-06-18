package core.oop.abstract_classes.pet_hierarchy;

public class Dog extends Pet {
  public Dog() {
    super(4, "Гав");
  }

  public void bringStick() {
    System.out.println("Принёс палочку, как хороший мальчик!");
  }
}
