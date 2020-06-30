public class Employee {

    String name;
    double salary;

    public Employee(String n){
        this.name = n;
        this.salary = 2000;
    }

    public String toString(){
        return " Nombre = "+name+" Salario = "+salary;
    }
}
