import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void printSeparator() {
        System.out.println("============================================");
    }
    public static void printStudentInfo(Hogwarts student) {
        System.out.println(student);
    }
    public static void compareGryffindor(Gryffindor student1, Gryffindor student2) {
        var s1 = student1.ability();
        var s2 = student2.ability();
        if (s1 > s2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        }
    }
    public static void compareHufflepuff(Hufflepuff student1, Hufflepuff student2) {
        var s1 = student1.ability();
        var s2 = student2.ability();
        if (s1 > s2) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        }
    }
    public static void compareRavenclaw(Ravenclaw student1, Ravenclaw student2) {
        var s1 = student1.ability();
        var s2 = student2.ability();
        if (s1 > s2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        }
    }
    public static void compareSlytherin(Slytherin student1, Slytherin student2) {
        var s1 = student1.ability();
        var s2 = student2.ability();
        if (s1 > s2) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        }
    }

    public static void compareTwoStudents(Hogwarts student1, Hogwarts student2) {
        if (student1.getPowerOfWitchcraft() > student2.getPowerOfWitchcraft()) {
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName());
        }
        if (student1.getTransgression() > student2.getTransgression()) {
            System.out.println(student1.getName() + " обладает большей мощностью трансгрессии, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " обладает большей мощностью трансгрессии, чем " + student1.getName());
        }
    }



    public static void main(String[] args) {
        var harry = new Gryffindor("Гарри Поттер", 86, 79, 91, 86, 100);
        var hermione = new Gryffindor("Гермиона Грейнджер", 89, 49, 94, 83, 87);
        var ron = new Gryffindor("Рон Уизли", 32, 29, 77, 64, 52);
        var zaharia = new Hufflepuff("Захария Смит", 68, 45, 88, 73, 99);
        var sedrick = new Hufflepuff("Седрик Диггори", 97, 76, 95, 100, 74);
        var justin = new Hufflepuff("Джастин Финч-Флетчли", 15, 10, 21, 86, 32);
        var zhou = new Ravenclaw("Чжоу Чанг", 85, 39, 89, 55, 76, 91);
        var padma = new Ravenclaw("Падма Патил", 64, 31, 69, 81, 30, 19);
        var marcus = new Ravenclaw("Маркус Белби", 9, 44, 64, 59, 38, 97);
        var draco = new Slytherin("Драко Малфой", 79, 94, 100, 60, 43, 52, 98);
        var graham = new Slytherin("Грэхэм Монтегю", 31, 65, 48, 73, 52, 12, 3);
        var gregory = new Slytherin("Грегори Гойл", 17, 24, 77, 22, 41, 7, 71);
        printSeparator();
        printStudentInfo(ron);
        printSeparator();
        compareGryffindor(harry, ron);
        printSeparator();
        compareHufflepuff(sedrick, justin);
        printSeparator();
        compareTwoStudents(sedrick, harry);
    }
}