package DesignPattern.Singleton;

public class SingletonPattern {

	private SingletonPattern() {
	};

	private static SingletonPattern self = null;

	public static SingletonPattern getInstance() {
		if (self == null) {
			self = new SingletonPattern();
		}
		return self;
	}

	public void say() {
		System.out.println("I'm so happy");
	}

}
