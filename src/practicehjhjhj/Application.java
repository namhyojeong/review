package practicehjhjhj;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		String id = sc.nextLine();
		System.out.print("pwd : ");
		String pwd = sc.nextLine();
		System.out.print("name : ");
		String name = sc.nextLine();
		
		MemberDTO mem = new MemberDTO(id, pwd, name);
		
		mem.getInformation();
		
		
	}
	
	
}
