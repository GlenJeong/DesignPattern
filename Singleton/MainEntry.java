package DesignPattern.Singleton;

public class MainEntry {

    public static void main(String[] args) {

        SingletonPattern singleton1 = SingletonPattern.getInstance();

        singleton1.say();

        SingletonPattern singleton2 = SingletonPattern.getInstance();

        System.out.println(SingletonPattern.getInstance());

        if (singleton1 == singleton2) {
            System.out.println("같은 객체입니다. ");
        } else {
            System.out.println("다른 객체 입니다. ");
        }
    }
}
