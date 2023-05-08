package demo.pvdemo06configurationclasses;

public class Cylinder {
    
    Circle circle;

    public Cylinder(Circle circle) {
        this.circle = circle;
    }

    @Override
    public String toString() {
        return "Cylinder [circle=" + circle + "]";
    }

}
