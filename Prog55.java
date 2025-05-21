package dhivya;

class Person1 {
    Person1(String name) {
        System.out.println("person Name:" + name);
    }
}

class Employee extends Person1 {
    int employeeid;

    Employee() {
        super("dhivya"); // Calls Person1 constructor with "dhivya"
    }

    void display(int employeeid) {
        this.employeeid = employeeid;
