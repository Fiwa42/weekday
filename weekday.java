// A Program that tells you the weekday when you give it the Day, Month, and Year

import java.util.Scanner;

public class weekday {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Day?");
    int day = scanner.nextInt();
    
    System.out.println("Month?");
    int month = scanner.nextInt();
    
    System.out.println("Year?");
    int year = scanner.nextInt();
    
    int year1, year2, h1, h2, h3, b, f = 0;
    
    if (month  < 3) {
      month += 10;
      year--;
    } else {
        month -= 2;
      }
    
    year1 = year / 100;
    year2 = year % 100;
    
    h1 = ((month * 13) - 1) / 5;
    h2 = year2 / 4;
    h3 = year1 / 4;
    
    b = h1 + h2 + h3;

    f = (b + year2 + day) - (year1 * 2);
    
    while (f < 0) {
      f += 7;
    }
    
    switch (f %= 7) {
      case 0: 
        System.out.println("Sunday");
        break;
      case 1: 
        System.out.println("Monday");
        break;
      case 2: 
        System.out.println("Tuesday");
        break;
      case 3: 
        System.out.println("Wednesday");
        break;
      case 4: 
        System.out.println("Thursday");
        break;
      case 5: 
        System.out.println("Friday");
        break;
      case 6: 
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Does not exist");
      }    
  }
}

