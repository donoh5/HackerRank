package easy;

import java.util.Scanner;

public class JavaDateAndTime {
	public static void main (String[] agrs) {
		Scanner my_inp = new Scanner(System.in);
		
		int year, month, day;
		month = my_inp.nextInt();
		day = my_inp.nextInt();
		year = my_inp.nextInt();
		
		int total=(year-1)*365
                +(year-1)/4
                -(year-1)/100
                +(year-1)/400;
        
        int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
        
        if((year%4==0 && year%100!=0)||(year%400==0))
            lastDay[1]=29;
        else
            lastDay[1]=28;
        
        for(int i=0;i<month-1;i++) {
            total+=lastDay[i];
        }
        
        total+=day;
        
        int week=total%7;
        String[] strWeek= {"SUNDAY","MONDAY","TUESDAY","WEDNSDAY","THURSDAU","FRIDAY","SATURDAY"};
        System.out.println(strWeek[week]);
		
		my_inp.close();	
	}
}