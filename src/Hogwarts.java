public class Hogwarts {
    private String name;
    private int powerOfWitchcraft;
    private int transgression;

    public Hogwarts(String name, int powerOfWitchcraft, int transgression) {
        this.name = name;
        this.powerOfWitchcraft = powerOfWitchcraft;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerOfWitchcraft() {
        return powerOfWitchcraft;
    }

    public void setPowerOfWitchcraft(int powerOfWitchcraft) {
        this.powerOfWitchcraft = powerOfWitchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
    @Override
    public String toString() {
        return "" +
                "Имя = " + name +
                ", Магия = " + powerOfWitchcraft +
                ", Трансгрессия = " + transgression;
    }
}
