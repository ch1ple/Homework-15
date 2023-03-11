public class PrintService {
    public void print(Gryffindor[] gryffindors) {
        System.out.println("Студенты факультета Гриффиндор:" + gryffindors.length);
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя " + gryffindor.getName()
                    + "; Сила магии " + gryffindor.getPowerOfWitchcraft()
                    + "; Уровень трансгрессии " + gryffindor.getTransgression()
                    + "; Благородство " + gryffindor.getNobility()
                    + "; Честь " + gryffindor.getHonor()
                    + "; Храбрость " + gryffindor.getBravery());
        }
    }
    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Студенты факультета Пуффендуй:" + hufflepuffs.length);
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя " + hufflepuff.getName()
                    + "; Сила магии " + hufflepuff.getPowerOfWitchcraft()
                    + "; Уровень трансгрессии " + hufflepuff.getTransgression()
                    + "; Трудолюбие " + hufflepuff.getIndustriousness()
                    + "; Верность " + hufflepuff.getLoyalty()
                    + "; Честность " + hufflepuff.getHonesty());
        }
    }
    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Студенты факультета Когтевран:" + ravenclaws.length);
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя " + ravenclaw.getName()
                    + "; Сила магии " + ravenclaw.getPowerOfWitchcraft()
                    + "; Уровень трансгрессии " + ravenclaw.getTransgression()
                    + "; Ум " + ravenclaw.getSmart()
                    + "; Мудрость " + ravenclaw.getWisdom()
                    + "; Остроумие " + ravenclaw.getWit()
                    + "; Творчество " + ravenclaw.getCreativity());
        }
    }
    public void print(Slytherin[] slytherins) {
        System.out.println("Студенты факультета Слизерин:" + slytherins.length);
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя " + slytherin.getName()
                    + "; Сила магии " + slytherin.getPowerOfWitchcraft()
                    + "; Уровень трансгрессии " + slytherin.getTransgression()
                    + "; Хитрость " + slytherin.getCunning()
                    + "; Решительность " + slytherin.getDetermination()
                    + "; Амбициозность " + slytherin.getAmbition()
                    + "; Находчивость " + slytherin.getAmbition()
                    + "; Жажда власти " + slytherin.getLustOfPower());
        }
    }
}
