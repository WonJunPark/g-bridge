package javastudy;

public class Gun {
	
    protected String model;       // model name of gun
    protected int bulletCount;    // total count of bullet

    public void fire() {
        System.out.println(model + "=>");
        bulletCount -= 1;
    }

    public Gun(String model) {
        bulletCount = 10;
        this.model = model;
    }   
}