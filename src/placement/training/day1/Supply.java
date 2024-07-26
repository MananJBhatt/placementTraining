package placement.training.day1;

import java.util.Scanner;

public class Supply {

    private int code;
    private String foodName , sticker , foodType;

    public void getType(String sticker){
        switch (sticker.toLowerCase()){
            case "green" :
                foodType="Vegetarian";
                break;
            case "yellow":
                foodType="Contains Egg";
                break;
            case "red":
                foodType="Non - Veg";
                break;
        }
    }
    public void foodIn(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Code: ");
        code = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Food Name: ");
        foodName = scanner.nextLine();

        System.out.print("Enter Sticker (Green/Yellow/Red): ");
        sticker = scanner.nextLine();
        getType(sticker);

    }
    public void foodOut(){
        System.out.println(code + " "+ foodName +" "+ foodType);
    }
}
