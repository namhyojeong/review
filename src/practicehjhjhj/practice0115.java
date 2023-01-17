package practicehjhjhj;

import java.util.Scanner;

public class practice0115 {

	public static void main(String[] args) {
		
	/* Scanner를 통해 5 이상의 정수를 입력받아, 
	 * 입력받은 값만큼의 길이를 갖는 int형 배열을 선언하세요.
	 * 그 후, 배열의 0번째 인덱스부터 입력받은 값을 넣되, 
	 * 1씩 감소하여 마지막 인덱스에는 1이 저장되도록 하세요.
	 * 그 후 배열에 저장된 값을 개행 없이 출력하시오.
	 * 예) 입력값 : 5
	 * 5 4 3 2 1
	 * 힌트) 개행 없이 출력할 땐 println()가 아니라 print()를 사용하자*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("5 이상의 정수를 입력하세요.");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int value = 1;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = num --;
			System.out.print(arr[i]);
		}
	}
}

