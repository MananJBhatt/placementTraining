package placement.training.day2;

import java.util.Scanner;

public class PersonTaxCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scan.next();
        System.out.println("Enter age");
        int age = scan.nextInt();
        System.out.println("Enter gender");
        String gender = scan.next();
        System.out.println("Enter income");
        int income = scan.nextInt();
        Person person = new Person(gender,age,name,income);
        TaxCalculator tax = new TaxCalculator();
        tax.calculateTax(person);
        System.out.println(person);
        /*
        student
            name
            id
            per
            gender
        */
    }
}
