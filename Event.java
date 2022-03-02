/*Modify the method that sets the event number in the Event class so that if the argument passed to the method is not a four-character String that starts with a letter followed by three digits, then the event number is forced to A000. If the initial letter in the event number is not uppercase, force it to be so.
Add a contact phone number field to the Event class.
Add a set method for the contact phone number field in the Event class. Whether the user enters all digits or any combination of digits, spaces, dashes, dots, or parentheses for a phone number, store it as all digits. For example, if the user enters (920) 872-9182, store the phone number as 9208729182. If the user enters a number with fewer or more than 10 digits, store the number as 0000000000.
Add a get method for the phone number field. The get method returns the phone number as a String constructed as follows: parentheses surround a three-digit area code, followed by a space, followed by the three-digit phone exchange, followed by a hyphen, followed by the last four digits of the phone number.
Modify the EventDemo program so that besides the event number and guests, the program also prompts the user for and retrieves a contact phone number for each of the sample objects. Display the phone number along with the other Event details. Test the EventDemo application to make sure it works correctly with valid and invalid event and phone numbers
*/
public class Event {
	
	public final static int HIGHER_PRICE = 35;
	public final static int LOWER_PRICE = 32;
	public final static int CUT_OFF = 50;
    
	private String PhoneNum;
	private String EventNum;
    private int NumOfGuests;
    private int EventPrice;
    private int PricePerGuest;
    
    public Event(String EventNum, String PhoneNum, int NumOfGuests){
    	setEventNumber(EventNum);
    	setPhoneNumber(PhoneNum);
    	setGuests(NumOfGuests);
    }
    public boolean isLargeEvent() {
    	if (NumOfGuests >= CUT_OFF) {
    		return true;
    	} else {
    		return false;
    	}
    }
    public void setPhoneNumber(String PhoneNumber) {
    	String NumString = "";
    	for (int x = 0; x < PhoneNumber.length(); x++) {
    		if(Character.isDigit(PhoneNumber.charAt(x))) {
    			NumString += PhoneNumber.charAt(x);
    				if((NumString.length() == 10)) {
    					PhoneNum = NumString;
    				} else {
    					PhoneNum = "0000000000";
    				}
    		}
    	}
    }
    
    public void setEventNumber(String eventNum) {
    	EventNum = "A000";
        if (eventNum.length() == 4){
        	if (Character.isAlphabetic(eventNum.charAt(0)) && Character.isDigit(eventNum.charAt(1))
    			&& Character.isDigit(eventNum.charAt(2)) && Character.isDigit(eventNum.charAt(3))) {
        			EventNum = eventNum.substring(0 , 1).toUpperCase() + eventNum.substring(1,4);
        	} else if(!(eventNum.length() == 4)){
    		EventNum = "A000";
        	} else {
        	EventNum = "A000";
        	}
        }
    }
    public void setGuests(int noOfGuest) {
    	NumOfGuests = noOfGuest;
    		if (isLargeEvent() == true){
    			PricePerGuest = LOWER_PRICE;
    		} else {
    			PricePerGuest = HIGHER_PRICE;
    		}
    	EventPrice = noOfGuest * PricePerGuest;
    }   
    public String getPhoneNumber() {
		PhoneNum = "(" + PhoneNum.substring(0,3) + ") " + PhoneNum.substring(3,6) + "-" + PhoneNum.substring(6, PhoneNum.length());
    	return PhoneNum;
    	
    }
    public String getEventNumber() {
        return EventNum;
    }
    public int getNumOfGuests() {
        return NumOfGuests;
    }
    public int getPricePerGuest() {
    	return PricePerGuest;
    }
    public int getPrice() {
        return EventPrice;
    }
}