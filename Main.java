package ru.aleksol.employees;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Petrov Petr", "Master", "qwe@rty.com", "111-11-11", 5000, 22);
        employees[1] = new Employee("Tolstoy Lev", "Technical writer", "asd@rty.com", "222-11-11", 10000, 32);
        employees[2] = new Employee("Ivanov Ivan", "Programmer", "jko@rty.com", "333-11-11", 50000, 42);
        employees[3] = new Employee("Sidorov Sidor", "Chief", "zxcv@rty.com", "444-11-11", 100000, 52);
        employees[4] = new Employee("Johnson John", "President", "asd@rty.com", "555-11-11", 1000000, 62);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].printProperties();
            }
        }
    }

}
