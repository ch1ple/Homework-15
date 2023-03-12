public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerOfWitchcraft, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, powerOfWitchcraft, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public int ability() {
        return industriousness + loyalty + honesty;
    }


    @Override
    public String toString() {
        return "Пуффендуй: " + super.toString() +
                ", Трудолюбие = " + industriousness +
                ", Верность = " + loyalty +
                ", Честность = " + honesty;
    }
}
