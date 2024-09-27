class Ex7_7 {
	public static void main(String args[]) {
		// Car car = null;
		// FireEngine fe = new FireEngine();
		// FireEngine fe2 = null;
		Car car = new FireEngine(); // 업캐스팅
		FireEngine fe = new FireEngine();
		FireEngine fecar = (FireEngine) car; // 다운캐스팅
		// 참조변수 선언은 Car로 되었지만 다웉캐스팅을 통해 water()사용
		fecar.water();
		System.out.println("first");
		fe.water();
		car = fe;
		// car.water();
		// fe2 = (FireEngine) car;
		// fe2.water();

		// 이 아래가 궁금했던건데
		Car myAnimal = new Car();
		System.out.println("new");
		if (myAnimal instanceof FireEngine) {
			FireEngine myDog = (FireEngine) myAnimal;
			// 안전하게 Dog의 메서드 사용 가능
			myDog.water();
		} else {
			System.out.println("myAnimal은 Dog의 인스턴스가 아닙니다.");
		}

	}
}

class Car {
	String color;
	int door;

	void drive() {
		System.out.println("drive, Brrrr~");
	}

	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}