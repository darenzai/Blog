package Bean;

public class Person {

    private String name;

    private String say;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", say='" + say + '\'' +
                '}';
    }
}
