package my.triangle.Objects;

/**
 * Created by Alex on 28.04.2016.
 */
public class View {
    //Constants
    final String WELCOME = "Welcome, friend!\nNeed to count a triangle by 2 sides and an angle? No problems!";
    final String ANGLE = "Enter your angle";
    final String SIDE_A = "Enter your first side";
    final String SIDE_B = "Enter your second side";

    //Work methods
    void printMessage(String message){
        System.out.println(message);
    }
    //A Method to show user his result
    void square(double solve){printMessage("Your square = "+solve);}
}
