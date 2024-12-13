package deneme_01;

import java.util.Scanner;

public class alistirma_02 {

			 
	public static void main(String[] args) {
		int matematik,fizik,kimya,biyoloji,turkce,sosyal;
		Scanner input= new Scanner(System.in);
		System.out.println("matematik notunuzu girin:");
		matematik=input.nextInt();
		
		System.out.println("fizik notunuzu girin:");
		fizik=input.nextInt();

		System.out.println("kimya notunuzu girin:");
		kimya=input.nextInt();

		System.out.println("biyoloji notunuzu girin:");
		biyoloji=input.nextInt();

		System.out.println("türkçe notunuzu girin:");
		turkce=input.nextInt();

		System.out.println("sosyal notunuzu girin:");
		sosyal=input.nextInt();

double ortalama=matematik+fizik+kimya+biyoloji+sosyal+turkce;
ortalama=ortalama/6;
System.out.println(ortalama>50? "gectiniz": "kaldınız");
			input.close();
			
	}

}
