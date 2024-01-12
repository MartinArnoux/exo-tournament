public abstract class Fighter {
    private final String name;
    private int hitPoints;
    private final Weapon w;

    private Shield shield;

    private boolean armor;
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
                target.takeDamage(this);
            }
            if (!target.isDead()) {
                takeDamage(target);
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
    private void takeDamage(Fighter f){
        //System.out.println(this.name +" take " + damage);
        hitPoints = Math.max(hitPoints - calculeDamage(f), 0);
    }
    private int calculeDamage(Fighter f){
        System.out.println(f.w.getClass());

        if(f.w.canHit())
        {
            System.out.println("passe");

            if (shield==null || !shield.block(f.w) )
            {
                return f.w.getDamage() - (armor ?3:0) - (f.armor?1:0);
            }
            else
                return 0;
        }
        else {
            return 0;
        }
    }


    public Fighter equip(String name)
    {
        switch (name)
        {
            case "buckler":
                shield = new Shield();
                break;
            case "armor":
                armor = true;
                break;
        }
        return this;
    }
}
