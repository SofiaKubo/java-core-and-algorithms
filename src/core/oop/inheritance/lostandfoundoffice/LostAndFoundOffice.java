package core.oop.inheritance.lostandfoundoffice;

import java.util.ArrayList;

public class LostAndFoundOffice {
  private final ArrayList<Object> things = new ArrayList<>();

  public void put(Object element) {
    if (element != null) {
      things.add(element);
    }
  }

  public boolean check(Object target) {
    if (target == null) {
      return false;
    }

    return things.contains(target);
  }
}
