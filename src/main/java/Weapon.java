public class Weapon {
    private final int damage;
    private final boolean damageShield;


    public Weapon(int damage,boolean damageShield) {
        this.damage = damage;
        this.damageShield = damageShield;
    }
    public int getDamage()
    {
        return damage;
    }
    public boolean canHit(){
        return true;
    }
    public boolean damageShield()
    {
        return damageShield;
    }
}
