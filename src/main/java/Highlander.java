public class Highlander extends Fighter{
    public Highlander()
    {
        super("Highlander",150,new GreatSword());
    }

    @Override
    public Highlander equip(String name) {
        return (Highlander)super.equip(name);
    }
}
