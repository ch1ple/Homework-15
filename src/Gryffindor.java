import java.util.Arrays;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerOfWitchcraft, int transgression, int nobility, int honor, int bravery) {
        super(name, powerOfWitchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int ability() {
        return nobility + honor + bravery;
    }

    public void compare(Gryffindor student) {
        var s1 = ability();
        var s2 = student.ability();
        if (s1 > s2) {
            System.out.println(getName() + " лучший Гриффиндорец, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " лучший Гриффиндорец, чем " + getName());
        }
    }
    @Override
    public String toString() {
        return "Гриффиндор: " + super.toString() +
                ", Благородство = " + nobility +
                ", Честь = " + honor +
                ", Храбрость = " + bravery;
    }
}
