package hw11;

public class Person {
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