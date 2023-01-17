package practicehjhjhj;

import java.util.Scanner;

public class bb {

	public static void main(String[] args) {

		int[][]gugudan = new int[8][9];
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 9; j++) {
				gugudan[i][j] = (i + 2) * (j + 1); 
				
			System.out.println((i+2) + "*" + (j+1) + "=" + gugudan[i][j]);
			}
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단 : ");
		int dan = sc.nextInt();
		System.out.print("출력할 곱 : ");
		int su = sc.nextInt();
		
		int[][]gugudan1 = new int[8][9];
		gugudan1[dan][su] = dan * su;
		System.out.println(dan + " * " + su + " = " + gugudan1[dan][su]);
	}

	}



