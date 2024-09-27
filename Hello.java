import java.util.*;

//---main----
public class Hello {
	public static void main(String[] args) {

	}
}// ---main end----
	// 모두 상속받은 클래스를 구현해보고 main메소드에서 사용해보셈

// ------------------인터페이스--------------------
interface Inter {
	public void method();

	default void method1() {
		System.out.println("인터페이스의 디폴트 메소드");
	}

	static void staticMethod() {
		System.out.println("인터페이스의 스테틱 메소드");
	}
}
// ------------------인터페이스 end--------------------

// ------------------추상--------------------
abstract class Abs {
	int x;

	abstract void x(int a);

	void y() {// 몬가 구현했음};
	}
	// ------------------추상 end--------------------

	// ----Cla class------
class Cla {
	public void method3(){
		System.out.println("Class Cla의 메소드");
	}
}
// ----Cla class end------