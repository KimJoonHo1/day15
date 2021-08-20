package day15;

import java.util.Scanner;

class A03 extends Thread {
	public void run() {
		while(true) {
			try {
				System.out.println("답글이 날라옵니다.");
				Thread.sleep(1000);
			} catch(Exception e) {
				
			}
		}
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String message = null;
		A03 a = new A03();
		a.setDaemon(true);
		a.start();
		while(true) {
			System.out.println("전송 메세지 : ");
			message = scanner.nextLine();
			System.out.println(message);
			if(message.equals("exit")) {
				break;
			}
		}
		System.out.println("프로그램을 종료 합니다.");
		System.out.println("프로그램을 종료 합니다.");
		System.out.println("프로그램을 종료 합니다.");
	}

}
