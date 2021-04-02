package observer;

public abstract class Person {
    public Person(String name) {
        this.name = name;
    }

   private String name;

    public String getName() {
        return name;
    }

    // Never used, but leaving it for future
    public void setName(String name) {
        this.name = name;
    }
}
