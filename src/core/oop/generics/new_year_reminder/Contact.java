package core.oop.generics.new_year_reminder;

public abstract class Contact {
  protected final String name;

  protected Contact(String name) {
    this.name = name;
  }

  public abstract String getName();

  public abstract void sendMessage();

  public abstract void print();
}
