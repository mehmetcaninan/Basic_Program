package deneme_01;

import java.util.Scanner;

public class alistirma_02 {

			 
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("urun fiyatını girin:");
		int price=scanner.nextInt();
		if (price<1000 && price>0) {
			System.out.println("fiyat:"+price+" tl\nkdv:"+(price*0.18)+" tl");
			
		}else {
			System.out.println("fiyat:"+price+" tl\nkdv:"+(price*0.08)+" tl");
		}
		scanner.close();
	}

}
