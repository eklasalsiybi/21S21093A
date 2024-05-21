public class Patient {
    private String name;
    private String condition;

    public Patient(String name, int age, String condition) {
        this.name = name;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Condition: " + condition;
    }
}
