
import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하세요: ");
		String name = input.next();
		
		System.out.print("연락처를 입력하세요: ");
		int phone = input.nextInt(); //숫자만 입력
		
		String greeting = "Welcome to Shopping Mall!";
		String tagline = "Welcome to book Market!!";
		
		boolean quit = false;
		
		while(!quit) {
		
		System.out.println("****************************");
		System.out.println("\t" + greeting);
		System.out.println("\t" + tagline);
		System.out.println("****************************");
		
		System.out.println("1. 고객 정보 확인하기 \t5. 바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록보기 \t6. 장바구니에 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기 \t7. 장바구니에 항목 삭제하기");
		System.out.println("4. 영수증 표시하기 \t8. 종료");
		System.out.println("****************************");
		
		System.out.println("메뉴 번호를 선택하세요: ");
		int choice = input.nextInt();
		System.out.println(choice + "번을 선택했습니다.");

	if(choice < 1 || choice > 8) {
		System.out.println("1부터 8까지의 숫자를 입력하세요.");
		switch(choice) {
		case 1:
			System.out.println("1. 현재 고객 정보: ");
			System.out.println("이름: " + name + " 연락처: " + phone);
			break;
		case 2:
			System.out.println("2. 장바구니 상품 목록 보기: ");
			break;
		case 3:
			System.out.println("3. 장바구니 비우기: ");
			break;
		case 4:
			System.out.println("4. 영수증 표시하기: ");
			break;
		case 5:
			System.out.println("5. 장바구니에 항목 추가하기: ");
			break;
		case 6:
			System.out.println("6. 장바구니의 항목 수량 줄이기: ");
			break;
		case 7:
			System.out.println("7. 장바구니의 항목 삭제하기: ");
			break;
		case 8:
			System.out.println("8. 종료");
			quit = true;
			break;
	    } // switch 끝
    } // if else 끝
	} // while 끝
} //main 함수 끝
} //welcome 클래스끝