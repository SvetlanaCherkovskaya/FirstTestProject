/**
 * Java 1. Homework #5
 * <p>
 * author Svetlana Cherkovskaya
 * version 22.12.2021
 */

class Employee {
    private String full_name;
    private String position;
    private String email;
    private long phone;
    private int salary;
    private int age;

    Employee(String full_name, String position, String email, long phone, int salary, int age) {
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {

        return full_name + ", " +
                position + ", " +
                email + ", " +
                "+" + phone + ", " +
                salary + " rub, " +
                age;
    }

    public Integer getAge() {
        return age;
    }
}
