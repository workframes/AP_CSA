/*
* Purpose: Define a Employee object
*/

public class Employee {
    private String name;
    private String empId;
    private int pay;

    public Employee(){
        name = null;
        empId = null;
        pay = 0;
    }

    public Employee(String nm, String id, int py){
        name = nm;
        empId = id;
        pay = py;
    }

    public Employee(String nm, String id){
        name = nm;
        empId = id;
        pay = 20;
    }
}
