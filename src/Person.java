import java.util.ArrayList;
import java.util.List;

public class Person {

    private List<Choice> choices;
    private String name;

    public Person(String name) {
        this.name = name;
        choices = new ArrayList<>();
    }

    public void addChoice(Choice choice) {
        choices.add(choice);
    }

    public List<Choice> getChoices() {
        return this.choices;
    }

    public String getName() {
        return name;
    }
}
