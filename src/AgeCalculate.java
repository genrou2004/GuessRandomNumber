

import java.time.LocalDate;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author 
 */
public class AgeCalculate {

    int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String id;
    int d, m, y;
    
    Scanner input = new Scanner(System.in);
    public AgeCalculate() {
       
        System.out.println("Enter your day=");
        d = input.nextInt();
        System.out.println("Enter your month=");
        m = input.nextInt();
        System.out.println("Enter your year=");
        y = input.nextInt();
    }

    public void CalculateAge() {
        int date = 0, mon = 0, year = 0;

        if (1 < d && 1 < m) {
            date = ((month[m - 1] + 01) - d);
            mon = (12 - m);
            year = (2017 - y);
        } else if (1 < d && 1 >= m) {
            date = ((month[m - 1] + 01) - d);
            mon = (12 - m);
            year = (2017 - y);
        } else if (d == 1 && 1 < m) {
            date = 1 - d;
            mon = (13 - m);
            year = (2017 - y);
        } else if (d == 1 && m == 1) {
            date = 1 - d;
            mon = (13 - m);
            year = (2017 - y);
        }
        System.out.println(year + " years " + mon + " months " + date + " days");
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String answer;
    	do{
    	AgeCalculate a = new AgeCalculate();
        LocalDate today = LocalDate.now();
        System.out.println("Your age calculated on date: " +today);
        a.CalculateAge();
        System.out.println("Would you like to enter details for another client? (Y/N)");
        answer = scan.next();
    	}while(answer.equalsIgnoreCase("Y"));
    	
    	if(answer.equalsIgnoreCase("N"))
    	{
    		System.out.println("Thanks for using the age calculator!");
    	}
    	scan.close();
    }
    
}