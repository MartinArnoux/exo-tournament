public class Viking extends Fighter{

    public Viking(){
        super("Viking",120,new Weapon(6,true));
    }

    @Override
    public Viking equip(String name) {
        return (Viking)super.equip(name);
    }
}
