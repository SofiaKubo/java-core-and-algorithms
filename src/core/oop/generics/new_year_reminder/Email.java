package core.oop.generics.new_year_reminder;

public class Email extends Contact {
  private final String email;

  public Email(String name, String email) {
    super(name);
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void sendMessage() {
    System.out.println("Отправим новогоднюю картинку коллеге на электронную почту " + email);
  }

  @Override
  public void print() {
    System.out.println("Email: " + getEmail());
  }
}
