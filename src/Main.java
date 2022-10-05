import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Choice choice1 = new Choice("Pera");
        Choice choice2 = new Choice("Zika");
        Choice choice3 = new Choice("Mika");

        Person person1 = new Person("Ana");
        person1.addChoice(choice1);
        person1.addChoice(choice2);
        person1.addChoice(choice3);

        Person person2 = new Person("Jana");
        person2.addChoice(choice1);
        person2.addChoice(choice2);
        person2.addChoice(choice3);

        Person person3 = new Person("Lena");
        person3.addChoice(choice1);
        person3.addChoice(choice2);
        person3.addChoice(choice3);

        List<Choice> choices = new ArrayList<>();
        choices.add(choice1);
        choices.add(choice2);
        choices.add(choice3);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        MakeMariages mariages = new MakeMariages();
        mariages.makeMariage(persons, choices);

        for(Choice choice : choices) {
            System.out.println(choice.toString());
        }

    }
}