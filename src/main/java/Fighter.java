public abstract class Fighter {
    private final String name;
    private int hitPoints;
    private final Weapon w;

    private Shield shield;

    public Fighter(String name,int hitPoints, Weapon w)
    {
        this.name = name;
        this.hitPoints = hitPoints;
        this.w = w;
        shield = null;
    }
    public void engage(Fighter target){
        System.out.println(name + " VS " + target.name);
        while(!isDead() && !target.isDead() ) {
            if (!isDead()) {
                target.takeDamage(w);
            }
            if (!target.isDead()) {
                takeDamage(target.w);
            }
        }
    }
    public boolean isDead()
    {
        return hitPoints <= 0;
    }

    public int hitPoints()
    {
        return hitPoints;
    }
    public void takeDamage(Weapon w){
        //System.out.println(this.name +" take " + damage);
        if (shield==null || !shield.block(w) )
            hitPoints = Math.max(hitPoints - w.getDamage(), 0);

    }

    public Fighter equip(String name)
    {
        if(name.equals("buckler"))
        {
            shield = new Shield();
        }
        return this;
    }
}
