import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void printSeparator() {
        System.out.println("=====================================");
    }
    public static void findTheBestStudentOfGryffindor(Gryffindor[] gryffindors) {
        int sumOfPropetries = 0;
        int theBiggestSum = 0;
        int index = 10;
        for (int i = 0; i < gryffindors.length; i++) {
            System.out.println(gryffindors[i].getName() + ": благородство = " + gryffindors[i].getNobility() + "; честь = " + gryffindors[i].getHonor() + "; храбрость = " + gryffindors[i].getBravery());
            sumOfPropetries = gryffindors[i].getNobility() + gryffindors[i].getHonor() + gryffindors[i].getBravery();
            System.out.println("Сумма баллов свойств = " + sumOfPropetries);
            if (theBiggestSum < sumOfPropetries) {
                theBiggestSum = sumOfPropetries;
                index = i;
            }
        }
        System.out.println("------------------------------------------");
        System.out.println(gryffindors[index].getName() + " - лучший студент факультета Гриффиндор");
    }
    public static void findTheBestStudentOfHufflepuff(Hufflepuff[] hufflepuffs) {
        int sumOfPropetries = 0;
        int theBiggestSum = 0;
        int index = 10;
        for (int i = 0; i < hufflepuffs.length; i++) {
            System.out.println(hufflepuffs[i].getName() + ": Трудолюбие = " + hufflepuffs[i].getIndustriousness() + "; Верность = " + hufflepuffs[i].getLoyalty() + "; Честность = " + hufflepuffs[i].getHonesty());
            sumOfPropetries = hufflepuffs[i].getIndustriousness() + hufflepuffs[i].getLoyalty() + hufflepuffs[i].getHonesty();
            System.out.println("Сумма баллов свойств = " + sumOfPropetries);
            if (theBiggestSum < sumOfPropetries) {
                theBiggestSum = sumOfPropetries;
                index = i;
            }
        }
        System.out.println("------------------------------------------");
        System.out.println(hufflepuffs[index].getName() + " - лучший студент факультета Пуффендуй");
    }
    public static void findTheBestStudentOfRavenclaw(Ravenclaw[] ravenclaws) {
        int sumOfPropetries = 0;
        int theBiggestSum = 0;
        int index = 10;
        for (int i = 0; i < ravenclaws.length; i++) {
            System.out.println(ravenclaws[i].getName() + ": Ум = " + ravenclaws[i].getSmart() + "; Мудрость = " + ravenclaws[i].getWisdom() + "; Остроумие = " + ravenclaws[i].getWit() + "; Творчество = " + ravenclaws[i]. getCreativity());
            sumOfPropetries = ravenclaws[i].getSmart() + ravenclaws[i].getWisdom() + ravenclaws[i].getWit() + ravenclaws[i].getCreativity();
            System.out.println("Сумма баллов свойств = " + sumOfPropetries);
            if (theBiggestSum < sumOfPropetries) {
                theBiggestSum = sumOfPropetries;
                index = i;
            }
        }
        System.out.println("------------------------------------------");
        System.out.println(ravenclaws[index].getName() + " - лучший студент факультета Когтевран");
    }
    public static void findTheBestStudentOfSlytherin(Slytherin[] slytherins) {
        int sumOfPropetries = 0;
        int theBiggestSum = 0;
        int index = 10;
        for (int i = 0; i < slytherins.length; i++) {
            System.out.println(slytherins[i].getName() + ": Хитрость = " + slytherins[i].getCunning() + "; Решительность = " + slytherins[i].getDetermination() + "; Амбициозность = " + slytherins[i].getAmbition() + "; Находчивость = " + slytherins[i].getResourcefulness() + "; Жажда власти = " + slytherins[i].getLustOfPower());
            sumOfPropetries = slytherins[i].getCunning() + slytherins[i].getDetermination() + slytherins[i].getAmbition() + slytherins[i].getResourcefulness() + slytherins[i].getLustOfPower();
            System.out.println("Сумма баллов свойств = " + sumOfPropetries);
            if (theBiggestSum < sumOfPropetries) {
                theBiggestSum = sumOfPropetries;
                index = i;
            }
        }
        System.out.println("------------------------------------------");
        System.out.println(slytherins[index].getName() + " - лучший студент факультета Слизерин");
    }

    public static void comparingTwoStudents(Gryffindor[] gryffindors, Hufflepuff[] hufflepuffs, Ravenclaw[] ravenclaws, Slytherin[] slytherins) {
        if (gryffindors[1].getPowerOfWitchcraft() < slytherins[0].getPowerOfWitchcraft()) {
            System.out.println(slytherins[0].getName() + " обладает большей мощностью магии, чем " + gryffindors[1].getName());
        } else {
            System.out.println(gryffindors[1].getName() + " обладает большей мощностью магии, чем " + slytherins[0].getName());
        }
        if (gryffindors[1].getTransgression() < slytherins[0].getTransgression()) {
            System.out.println(slytherins[0].getName() + " может трансгрессировать дальше, чем " + gryffindors[1].getName());
        } else {
            System.out.println(gryffindors[1].getName() + " может трансгрессировать дальше, чем " + slytherins[0].getName());
        }
    }



    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 86, 79, 91, 86, 100),
                new Gryffindor("Гермиона Грейнджер", 89, 49, 94, 83, 87),
                new Gryffindor("Рон Уизли", 32, 29, 77, 64, 52),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 68, 45, 88, 73, 99),
                new Hufflepuff("Седрик Диггори", 97, 76, 95, 100, 74),
                new Hufflepuff("Джастин Финч-Флетчли", 15, 10, 21, 86, 32),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 85, 39, 89, 55, 76, 91),
                new Ravenclaw("Падма Патил", 64, 31, 69, 81, 30, 19),
                new Ravenclaw("Маркус Белби", 9, 44, 64, 59, 38, 97),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 79, 94, 100, 60, 43, 52, 98),
                new Slytherin("Грэхэм Монтегю", 31, 65, 48, 73, 52, 12, 3),
                new Slytherin("Грегори Гойл", 17, 24, 77, 22, 41, 7, 71),
        };
        PrintService printService = new PrintService();
        printSeparator();
        printService.print(gryffindors);
        printSeparator();
        printService.print(hufflepuffs);
        printSeparator();
        printService.print(ravenclaws);
        printSeparator();
        printService.print(slytherins);
        printSeparator();
        findTheBestStudentOfGryffindor(gryffindors);
        printSeparator();
        findTheBestStudentOfHufflepuff(hufflepuffs);
        printSeparator();
        findTheBestStudentOfRavenclaw(ravenclaws);
        printSeparator();
        findTheBestStudentOfSlytherin(slytherins);
        printSeparator();
        comparingTwoStudents(gryffindors, hufflepuffs, ravenclaws, slytherins);
    }
}