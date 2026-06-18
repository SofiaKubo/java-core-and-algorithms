package core.oop.abstract_classes.pet_hierarchy;

public abstract class Pet {
  private final String voice;
  private final int pawsCount;

  protected Pet(int pawsCount, String voice) {
    this.pawsCount = pawsCount;
    this.voice = voice;
  }

  public String getVoice() {
    return voice;
  }

  public int getPawsCount() {
    return pawsCount;
  }

  public final void sleep() {
    System.out.println("Сплю");
  }

  public final void play() {
    System.out.println("Играю");
  }

  public void giveVoice() {
    System.out.println(voice);
  }
}
