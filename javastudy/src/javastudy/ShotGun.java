package javastudy;

public class ShotGun extends Gun {
    public void fire() {    	
        bulletCount -= 1;
    	System.out.printf("%s =}}} , %d\n",model, bulletCount);
    }
    
    public ShotGun(String model) {
    	super(model);
    }
}