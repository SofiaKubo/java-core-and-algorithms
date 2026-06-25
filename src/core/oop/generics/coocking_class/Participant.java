package core.oop.generics.coocking_class;

class Participant {
    private final String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getInfo() {
        return "Участник: " + name;
    }
}
