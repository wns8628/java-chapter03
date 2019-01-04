package chapter03;

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton obj1 = new Singleton(); //못함
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();

		System.out.println(obj2 == obj3);
	}

}
