package core.oop.abstract_classes.pet_hierarchy;

public class Cat extends Pet {
  public Cat() {
    super(4, "Мяу");
  }

  public void catchMouse() {
    System.out.println("Поймала мышку!");
  }
}
