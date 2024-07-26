package placement.training.day2;

public class TaxCalculator {
    //method to calculate tax
    public  void calculateTax(Person person){
        if(person.getAge()>=65 || person.getGender().equalsIgnoreCase("female")){
            person.setIncomeTax(0);
            System.out.println("Tax not applicable");
        }
        else{
            if(person.getIncome()<=160000){
                person.setIncomeTax(0);
                System.out.println("TAX NOT APPLICABLE LESS THAN 160K");
            }
            else if(person.getIncome()>160000 && person.getIncome()<500000){

                person.setIncomeTax((person.getIncome()-160000)*10/100);
                System.out.println("Slab 2");
            }
            else if(person.getIncome()>500000 && person.getIncome()<800000) {
                person.setIncomeTax((person.getIncome()-160000)*20/100);
                System.out.println("Slab 3");
            }
            else{
                person.setIncomeTax((person.getIncome()-160000)*30/100);
            }
        }
    }
}
