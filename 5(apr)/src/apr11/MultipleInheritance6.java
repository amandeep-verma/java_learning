package apr11;
// Now when we can both declare and define a method inside an interface and a class can implement multiple 

// interface, 2 interface with same method names implemented by a class would cause ambiguity problem.
// It can be resolved by 2 ways
// 1. Over riding the method in the implementing class with your own implementation
// 2. You can over ride  with default method already defined from either of interface using InterfaceName.super.MethodName

interface animal {
	void abc();

	default void show() {
		System.out.println("in animal");
	}
}

interface human {
	default void show() {
		System.out.println("in human");
	}
}

class Cat implements animal, human {
	public void abc() {
		System.out.println("in Cat");
	}

	public void show() {
		// Either of below 2 ways can be used.
		System.out.println("Over riden show from Cat");
		animal.super.show();
	}

}

public class MultipleInheritance6 {

	public static void main(String[] args) {
		animal a = new Cat();
		a.abc();
		a.show();

	}

}
