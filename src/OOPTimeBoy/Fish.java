package OOPTimeBoy;

public class Fish {
    private String name;
    private String color = "Yellow";
    private int speed = 60;

    public Fish() {
    }

    public Fish(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Fish(String name, String color, int speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
