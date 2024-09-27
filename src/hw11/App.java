package hw11;

public class App {
    static class Person{

         String name;
         int age;
         String profession;

        public Person(String name, int age, String profession){
            this.name = name;
            this.age = age;
            this.profession = profession;
        }

        public void infoPerson(){
            System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
        }

        public void changePerson(String newProfession) {
            this.profession = newProfession;
        }
    }
    public static void main(String[] args) {
        Person person1 = new Person("Дмитро",45, "Лікар");
        Person person2 = new Person("Віталіна",31, "Перукар");
        Person person3 = new Person("Саша",23,"Пілот");

        person1.infoPerson();
        person2.infoPerson();
        person3.infoPerson();

        Person person4 = new Person("Настя", 56,"Маляр");
        person4.infoPerson();
        person4.changePerson("Клерк");
        System.out.println();
        person4.infoPerson();
    }
}