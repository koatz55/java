public class Bat extends Mammals {

    public Bat(){
        super(300);
    }

    public Bat(int energyLevel){
        super(energyLevel);
    }

    public void fly(){
        System.out.println("Whooosshh! \nBat energy - 50");
        this.removeEnergy(50);
    }

    public void eatHumans(){
        this.addEnergy(25);
    }

    public void attackTown() {
        System.out.println("AAHHHHH the towns on fire! \nBAT energy - 100" );
        this.removeEnergy(100);
    }


}
