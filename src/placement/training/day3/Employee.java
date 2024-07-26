package placement.training.day3;

public class Employee {
    public String name;
    int id;
    protected String emailId;
    private  double salary;

    public void printName(){
        System.out.println(name);
    }
    void printId(){
        System.out.println(id);
    }
    protected void  printEmail(){
        System.out.println(emailId);
    }

    private void printSalary(){
        System.out.println(salary);
    }


}
