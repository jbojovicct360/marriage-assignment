import java.util.Collections;
import java.util.List;

public class MakeMariages {

    public void makeMariage(List<Person> persons, List<Choice> choices) {
        Collections.shuffle(persons);
        while (areAnyFreeChoice(choices)) {
            for (Person person : persons) {
                for (Choice choice : choices) {
                    if (choice.isFree()) {
                        choice.setMarriedWith(person);
                        break;
                    } else {
                        Person otherPerson = choice.getMarriedWith();
                        if(person.getChoices().indexOf(choice) < otherPerson.getChoices().indexOf(choice))
                            choice.setMarriedWith(person);
                    }
                }
            }
        }
    }

    private boolean areAnyFreeChoice(List<Choice> choices) {
        for (Choice choice : choices) {
            if(choice.isFree())
                return true;
        }
        return false;
    }

}
