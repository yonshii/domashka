package hw11;
public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Дмитро",45, "Лікар");
        Person person2 = new Person("Віталіна",31, "Перукар");
        Person person3 = new Person("Саша",23,"Пілот");

        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();

        Person person4 = new Person("Настя", 56,"Маляр");
        person4.printPersonInfo();
        person4.setProfession("Клерк");
        System.out.println();
        person4.printPersonInfo();
    }
}