package javastudy;

public abstract class Robot {
    private String name;

    void move() {
        System.out.println("Robot moved !!");
    }

    abstract void charging();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}