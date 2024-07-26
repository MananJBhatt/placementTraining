package placement.training.day1;

public class Animal_Class_Intro {

    private String name,type_ani,food_habit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType_ani() {
        return type_ani;
    }

    public void setType_ani(String type_ani) {
        this.type_ani = type_ani;
    }

    public String getFood_habit() {
        return food_habit;
    }

    public void setFood_habit(String food_habit) {
        this.food_habit = food_habit;
    }

    public void display(){
        System.out.println("Name = "+ name+" Type "+ type_ani + "food habit" + food_habit);
    }

    @Override
    public String toString() {
        return "Animal_Class_Intro{" +
                "name='" + name + '\'' +
                ", type_ani='" + type_ani + '\'' +
                ", food_habit='" + food_habit + '\'' +
                '}';
    }
}
