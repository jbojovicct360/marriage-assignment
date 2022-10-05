public class Choice {

    private String name;
    private boolean isFree;
    private Person marriedWith;

    public Choice(String name) {
        this.name = name;
        isFree = true;
        marriedWith = null;
    }

    public boolean isFree() {
        return this.isFree;
    }

    public void setMarriedWith(Person person) {
        this.marriedWith = person;
        this.isFree = false;
    }

    public Person getMarriedWith() {
        return marriedWith;
    }

    @Override
    public String toString() {
        if(marriedWith == null)
            return this.name + "is not married!";
        return this.name + " is married with " + marriedWith.getName() + "!";
    }
}
