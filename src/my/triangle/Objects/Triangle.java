package my.triangle.Objects;

/**
 * Created by Alex on 28.04.2016.
 */
public class Triangle {
    //Variables
    private int sideA , sideB, angle;

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    //Constructor
    public Triangle(int angle, int sideB, int sideA) {
        this.angle = angle;
        this.sideB = sideB;
        this.sideA = sideA;
    }

    //Work methods

    public double solve(){
        if (sideA < 1 || sideB < 1) throw new IllegalArgumentException("Your variables are wrong.");
        if (angle > 178) throw new IllegalArgumentException("Your angle is too big. Maximum = 178 deg.");
        else if (angle < 1) throw new IllegalArgumentException("Your angle is too small. Minimum = 1 deg.");
        //convert degrees into radians
        double radian = Math.toRadians(angle);
        return .5 * sideA * sideB * Math.sin(radian);
    }
}
