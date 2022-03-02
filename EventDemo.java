/* Continuously prompt for the number of guests for 
 * each Event until the value falls 
 * between 5 and 100 inclusive.
 * For one of the Event objects, create 
 * a loop that displays Please come to my event! 
 * as many times as there are guests for the Event.
*/
import java.util.Scanner;
public class EventDemo {	
	static Scanner in =new Scanner(System.in);
	public static void main (String[] args){
		System.out.println("*************************************************");
		System.out.println("* Carly's makes the food that makes it a party. *");
		System.out.println("*************************************************");
		Event Event1, Event2, Event3;
		String eventNum1, eventNum2, eventNum3, PhoneNum1, PhoneNum2, PhoneNum3;
		int gnum1, gnum2, gnum3;
	
		System.out.println("Enter Event Number: ");
		eventNum1 = in.next();
		System.out.println("Enter Number of guests: ");
		gnum1 = guestNumChecker(in.nextInt());
		System.out.println("Enter Phone Number Plz: ");
		PhoneNum1 = in.next();
		in.nextLine();
		
		System.out.println("Enter Event Number: ");
		eventNum2 = in.next();
		System.out.println("Enter Number of guests: ");
		gnum2 = guestNumChecker(in.nextInt());
		System.out.println("Enter Phone Number Plz: ");
		PhoneNum2 = in.next();
		in.nextLine();
		
		System.out.println("Enter Event Number: ");
		eventNum3 = in.next();
		System.out.println("Enter Number of guests: ");
		gnum3 = guestNumChecker(in.nextInt());
		System.out.println("Enter Phone Number Plz: ");
		PhoneNum3 = in.next();
		in.nextLine();
		
		Event1 = new Event(eventNum1, PhoneNum1, gnum1);
		Event2 = new Event(eventNum2, PhoneNum2, gnum2);
		Event3 = new Event(eventNum3, PhoneNum3, gnum3);
		
		displayEventVal(Event1);
		displayEventVal(Event2);
		displayEventVal(Event3);

	}
    public static int guestNumChecker(int guestnum) {
	      while(guestnum < 5 || guestnum > 100){
	    	  System.out.println("Guest limit: Not less than 5 AND not more than 100 >:( ");
	    	  guestnum = in.nextInt();
	      }
	      return guestnum;
    }
	public static void displayEventVal(Event event) {
		System.out.println("Event Number: " + event.getEventNumber());
		System.out.println("Available Contact Information: " + event.getPhoneNumber());
		System.out.println("Number of people: " + event.getNumOfGuests());	
		System.out.println("Price per guest $" + event.getPricePerGuest());
		System.out.println("Total Price $" + event.getPrice() + "\n");
	}
}

