public class Weapon {
    private String name;
    private final int damage;
    private final boolean damageShield;

    public Weapon(String name,int damage,boolean damageShield) {
        this.name = name;
        this.damage = damage;
        this.damageShield = damageShield;
    }
    public int getDamage()
    {
        return damage;
    }
    public boolean damageShield()
    {
        return damageShield;
    }
}
