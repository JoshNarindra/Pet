public class Cat extends Pet implements Walk{
    private String breed;

public Cat(String name, int age, String breed){
    super(name,age);
    this.breed = breed;
}

    public String getBreed(){
        return breed;
    }

    public void swipe(){
        System.out.println(getName() + " swipes at you!");
    }

    public void eats(){
        System.out.println(getName() + " eats small rodents!!");
    }

    public void sleeps(){
        System.out.println(getName() + " zzzzzzzz!");
    }

    public void makeSound(){
        System.out.println("Purr");
    }
}
