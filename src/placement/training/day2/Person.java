package placement.training.day2;

public class Person {
    private String gender;
    private int age;
    private String name;
    private int income;
    private int incomeTax;

    public Person(String gender, int age, String name, int income) {
        this.gender = gender;
        this.age = age;
        this.name = name;
        this.income = income;
    }

    //Getter Setters
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(int incomeTax) {
        this.incomeTax = incomeTax;
    }



    @Override
    public String toString() {
        return "Person{" +
                "gender='" + gender + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", income=" + income +
                ", incomeTax=" + incomeTax +
                ", taxSlab='" +  + '\'' +
                '}';
    }
}
