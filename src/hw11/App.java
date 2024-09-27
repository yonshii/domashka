package hw11;
    class Person{
        String name;
        int age;
        String profession;

        public Person(String name, int age, String profession){
            this.name = name;
            this.age = age;
            this.profession = profession;
        }

        public void printPersonInfo(){
            System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
        }

        public void setProfession(String newProfession) {
            this.profession = newProfession;
        }
    }
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