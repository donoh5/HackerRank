package easy;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
	public static void main (String[] agrs) {
		Scanner my_inp = new Scanner(System.in);
		
		double money = my_inp.nextDouble();
		Locale indiaLocale = new Locale("en", "IN");
		
		NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat i = NumberFormat.getCurrencyInstance(indiaLocale);
		NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		
		System.out.println("US: " + u.format(money));
		System.out.println("India: " + i.format(money));
		System.out.println("China: " + c.format(money));
		System.out.println("France: " + f.format(money));
		my_inp.close();	
	}
}