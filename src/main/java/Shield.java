public class Shield {
    private int healt;
    private boolean block;

    public Shield()
    {
        healt = 3;
        block = true;
    }

    public boolean block(Weapon w){
        if(block) {
            if (w.damageShield())
                healt--;
            boolean res = block;
            block = false;
            return res;
        }
        else {
            if (healt != 0)
                block = true;
            return false;
        }
    }
}
