package OOPTimeBoy;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person(123, "Shmueli", "Tomer");
        Person p3 = new Person(123, "Shmueli", "Tomer", "Rehovot", true);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("----------");

        Date d1 = new Date();
        Date d2 = new Date(24, 02, 1997);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println("----------");

        Item i1 = new Item(4312312, "Women", 3, "Black");
        Item i2 = new Item("Ronen", "Slave");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println("----------");

        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Fluffy", 45.4f);
        Dog dog3 = new Dog("DSAhk", 32.4f, "White");
        Dog dog4 = new Dog("Poggies", 32.4f, "Pink", true);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println("-----------");

        Fish fish1 = new Fish();
        Fish fish2 = new Fish("Boy", "Stav");
        Fish fish3 = new Fish("Tzvi", "Yellow", 60);
        System.out.println(fish1);
        System.out.println(fish2);
        System.out.println(fish3);
        System.out.println("----------");

        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(433.5, 341.2);
        Rectangle rec3 = new Rectangle(23.5, 41.2, "Big");
        System.out.println(rec1);
        System.out.println(rec2);
        System.out.println(rec3);
        System.out.println("----------");

        Printer print1 = new Printer();
        Printer print2 = new Printer(2313214, "4324xdf", "Tomer");
        Printer print3 = new Printer(234, "4xdf", "Tomer", false);
        System.out.println(print1);
        System.out.println(print2);
        System.out.println(print3);
        System.out.println("----------");

        Light light1 = new Light();
        Light light2 = new Light(21, 580.4);
        Light light3 = new Light(1, "Black");
        Light light4 = new Light(5, "Yellow", 4123);
        System.out.println(light1);
        System.out.println(light2);
        System.out.println(light3);
        System.out.println(light4);
        System.out.println("----------");

        Box box1 = new Box();
        Box box2 = new Box(4,5,6);
        System.out.println(box1);
        System.out.println(box2);
        System.out.println("----------");

        Student s1 = new Student();
        Student s2 = new Student(321321, "Shmueli", "Tomer", 100.0f, "Kobush");
        System.out.println(s1);
        System.out.println(s2);
    }
}
