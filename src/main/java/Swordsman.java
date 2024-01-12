public class Swordsman extends Fighter{


    public Swordsman(){
        super("Swordsman",100,new Weapon(5,false));
    }

    @Override
    public Swordsman equip(String name) {
        return (Swordsman) super.equip(name);
    }
}
