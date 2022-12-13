public class Program {
    public static void main(String[] args) {

        //        PET OBJ NOT USED AS PET CLASS IS NOW ABSTRACT.
        //        Pet obj = new Pet("Fido",7);
        //        Pet obj1 = new Pet("Fred",6);
        //        System.out.println(obj.getName() + " " + obj.getAge());
        //        obj.name = "Fred";
        //        obj.setAge(8);
        //        obj.getsOlder();
        //        System.out.println(obj.getName() + " " + obj.getAge());

        Dog d = new Dog("Lollie",6,"Border Collie");
        System.out.println(d.getName());
        d.makeSound();
        d.dig();
        //  d.breed = "chihuahua!";

        Cat c = new Cat("Catto",1,"Feral");
        System.out.println(c.getName());
        c.makeSound();

        Bird b = new Bird("Tweety",3,4.5f);
    }
}