package my.triangle;

import my.triangle.Objects.Controller;
import my.triangle.Objects.Triangle;
import my.triangle.Objects.View;

import java.util.Scanner;

/**
 * Created by Alex on 28.04.2016.
 */
public  class Main {

    public static void main(String[] ar){
        Triangle model = new Triangle(0,0,0);
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.triangleCounter();

    }
}
