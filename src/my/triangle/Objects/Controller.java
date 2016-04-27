package my.triangle.Objects;

import java.util.Scanner;

/**
 * Created by Alex on 28.04.2016.
 */
public class Controller {
    //Variables
    double square;

    Scanner scanner = new Scanner(System.in);
    Triangle triangle = new Triangle(0, 0, 0);
    View view = new View();

    public Controller(Triangle triangle, View view) {
        this.triangle = triangle;
        this.view = view;
    }

    //Work method
    public void triangleCounter() {
        view.printMessage(view.WELCOME);

        while(true) {
            view.printMessage(view.ANGLE);
            triangle.setAngle(scanner.nextInt());
            view.printMessage(view.SIDE_A);
            triangle.setSideA(scanner.nextInt());
            view.printMessage(view.SIDE_B);
            triangle.setSideB(scanner.nextInt());
            view.square(triangle.solve());
        }
    }


}

