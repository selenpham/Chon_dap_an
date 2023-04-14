//Bài 4. Thực hành với switch - case
//Viết chương trình cho phép người dùng chọn đáp án chính xác từ câu hỏi sau:
// Gói nào trong java chứa lớp Scanner dùng để nhập dữ liệu từ bàn phím ?
//A. java.net
//B. java.io
//C. java.util
//D. java.awt
//
//Câu trả lời của bạn : C 
//
//=> Đáp án in hoa hay in thường đều được chấp nhận.
//Sau khi người dùng chọn đáp án , Chương trình sẽ thông báo đáp án là đúng hoặc sai.

package LAB2;

import java.util.Scanner;

public class Thuchanh4_Chon_dap_an {
	
	public static void main (String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Goi nao trong java chua lop Scanner dung de nhap du lieu tu ban phim ?");
		System.out.println("A. java.net");
		System.out.println("B. java.io");
		System.out.println("C. java.util");
		System.out.println("D. java.awt");
				
		System.out.println("Nhap dap an cua ban (A/B/C/D): ");
		
		String input = scanner.nextLine();
		input = input.trim();
		input = input.toUpperCase();
		
		String message = "";
		
		switch(input) {
		case "A":
		case "B": 
		case "D":
			message = "Dap an cua ban chua dung";
			break;			
		case "C":
			message = "Dap an cua ban chinh xac";
			break;
		default:
			message = "Dap an cua ban chua hop le";
			break;
		}
		System.out.println(message);
	}
}


