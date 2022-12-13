public class Bird extends Pet implements Walk,Fly{
    private float wingspan;

    public Bird(String name, int age, float wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    @Override
    public void eats() {
        System.out.println("Peck Peck");
    }

}
