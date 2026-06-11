package core.oop.inheritance;

public class FigureInheritanceDemo {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    Square square = new Square();
    Circle circle = new Circle();
    Ellipse ellipse = new Ellipse();

    circle.draw();
    square.draw();
    rectangle.draw();
    ellipse.draw();
    ellipse.circleToEllipse();
  }
}

abstract class Figure {
  public abstract void draw();
}

class Circle extends Figure {
  @Override
  public void draw() {
    System.out.println("Рисуем круг");
  }
}

class Square extends Figure {
  @Override
  public void draw() {
    System.out.println("Рисуем квадрат");
  }
}

class Rectangle extends Figure {
  @Override
  public void draw() {
    System.out.println("Рисуем прямоугольник");
  }
}

class Ellipse extends Circle {
  @Override
  public void draw() {
    System.out.println("Рисуем овал");
  }

  public void circleToEllipse() {
    System.out.println("Превращаем круг в овал");
  }
}
