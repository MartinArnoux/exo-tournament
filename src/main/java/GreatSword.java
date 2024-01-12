public class GreatSword extends Weapon{
    static final int maxFatigue = 3;
    private boolean canHit;
    private int fatigue;
    public GreatSword(){
        super(12,false);
        canHit =true;
        fatigue = 1;
    }

    @Override
    public boolean canHit() {
        if(canHit){
            fatigue++;
            System.out.println(fatigue);
            if(fatigue==maxFatigue)
                canHit=false;
            return true;
        }
        else
        {
            fatigue = 1;
            canHit=true;
            return false;
        }

    }
}
