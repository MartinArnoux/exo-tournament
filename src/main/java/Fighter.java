public abstract class Fighter {
    private String name;
    private int hitPoints;
    private int dmg;

    public Fighter(String name,int hitPoints, int dmg)
    {
        this.name = name;
        this.hitPoints = hitPoints;
        this.dmg = dmg;
    }
    public void engage(Fighter target){
        System.out.println(name + " VS " + target.name);
        while(!isDead() && !target.isDead() ) {
            if (!isDead()) {
                target.takeDamage(dmg);
            }
            if (!target.isDead()) {
                takeDamage(target.dmg);
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
    public void takeDamage(int damage){
        //System.out.println(this.name +" take " + damage);
        hitPoints = Math.max(hitPoints - damage, 0);

    }
}
