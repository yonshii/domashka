package hw12;

public class Employee {
    private String name;
    private String position;
    private String mail;
    private int phone;
    private int age;

    public Employee(String name, String position, String mail, int phone, int age){
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.age = age;
    }

    public String getFullName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return mail;
    }

    public int getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    // Сеттери для зміни значень полів
    public void setFullName(String fullName) {
        this.name = fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.mail = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }
}