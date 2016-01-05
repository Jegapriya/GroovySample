package com.ttnd.test


/**
 * Created by niranjan on 5/1/16.
 */
class Employee {
    String name;
    int emp_id;
    int age;
    float salary;

    Employee(String name="Default Employee",int emp_id = -1,int age = 19,float salary = 1.0) {
        this.name = name;
        this.emp_id = emp_id;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", emp_id=" + emp_id +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
