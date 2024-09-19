
//패키지 안에 메모장 생성시키는건 모르겠어서 일단 경로 sungjuk.txt로 두겠습니다

package project;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

class YourScore {
	// private String 이름;
	// private int 국어;
	// private int 영어;
	// private int 수학;
	// ----------------field
	String 이름;
	int 국어;
	int 영어;
	int 수학;
	int 평균;

	// -------------constructor
	YourScore() {
	};

	YourScore(String 이름, int 국어, int 영어, int 수학) {
		this.이름 = 이름;
		this.국어 = 국어;
		this.영어 = 영어;
		this.수학 = 수학;
	}

	// -----------method

	public void 평균() {
		ArrayList<Integer> 배열 = new ArrayList<>(3);
		배열.add(국어);
		배열.add(영어);
		배열.add(수학);
		double aver = 0.0;
		double sum = 0.0;
		for (double i : 배열) {
			sum += i;
			aver = sum / 배열.size();
		}

		System.out.println("평균 " + aver + "점 입니다");
	}

	public void 덮어쓰기() {
		// 쓰기
		String fileName = "sungjuk.txt";
		FileWriter fr = null;
		try {
			// fr = new FileWriter(fileName, false);

			// PrintWriter out = new PrintWriter(fr, false);

			// out.println(이름);
			// out.println(국어);
			// out.println(영어);
			// out.println(수학);

			// out.close();

			평균();

		} catch (Exception e) {
			System.out.println("fail");

		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e) {
			}
		}
	}
}

public class Test06 {

	public static void main(String[] args) {
		YourScore 무궁화 = new YourScore("무궁화", 50, 85, 90);
		무궁화.평균();

	}

}
