/**
 * Java 1. Homework #5
 * <p>
 * author Svetlana Cherkovskaya
 * version 22.12.2021
 */


class HomeWork5 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanov Ivan Ivanovich", "director", "ivanov@mail.ru", 79999999999L, 200000, 41);
        System.out.println(employee1);
        Employee employee2 = new Employee("Petrov Petr Petrovich", "secretary", "petrov@mail.ru", 78888888888L, 100000, 25);
        System.out.println(employee2);
        Employee employee3 = new Employee("Valova Valentina Valentinovna", "accountant", "valova@email.ru", 77777777777L, 100000, 50);
        System.out.println(employee3);
        Employee employee4 = new Employee("Vasilieva Vasilisa Vasilievna", "engineer", "vasilieva@mail.ru", 75555555555L, 150000, 35);
        System.out.println(employee4);
        Employee employee5 = new Employee("Sidorov Sidor Sidorovich", "assistant", "sidorov@mail.ru", 74444444444L, 50000, 25);
        System.out.println(employee5);

        Employee[] employees = new Employee[5];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee4;

        System.out.println(" ");//разделитель

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i]);
            }
        }
    }
}
