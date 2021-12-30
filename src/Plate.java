/**
 * Java 1. Homework #7
 * <p>
 * author Svetlana Cherkovskaya
 * version 30.12.2021
 */

public class Plate {
    private int food;

    Plate(int food){
        this.food = food;
    }

     void decreaseFood (int food) {
        int remains;
        remains = this.food - food;

        if (remains >= 0) {
            this.food -= food;
        }
        else  {
            System.out.println("not  enough");
        }
    }

    void addFood (int food) {
        this.food += food;
    }

    public Integer getFood(){
        return food;
    }

    @Override
    public String toString() {
        return "Food: " + food;
    }
}
