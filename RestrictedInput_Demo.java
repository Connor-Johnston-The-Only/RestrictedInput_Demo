import java.awt.event.KeyEvent;


		//					! This is a demo... some things are not going to work !


/**
 * 			Uses
 * 
 * 		- intInputOnly (Boolean spaces (true or false), KeyChar "name")
 * 
 * 		- doubleInputOnly (Boolean spaces (true or false), Integer numberOfDoubles,  KeyChar "name")
 * 
 * 		- alphabetInputOnly (Boolean spaces (true or false), KeyChar "name")
 * 
 * 		- whiteSpaceInputOnly (KeyChar "name")
 * 
 * 
 * @author Connor Johnston
 *
 */

public class RestrictedInput_Demo {
	
	private static int counterForDouble, doubleValidEntryCounter;
	
//Int Input Only
									//Client code to specific to restrict space input or not
	public static void intInputOnly(Boolean spaces, KeyEvent e) {
		
		char testInput = e.getKeyChar();
		
		if(spaces == false) {
			
			if(!(Character.isDigit(testInput))) {
				//Consume will default the input back to before a key was pressed
				e.consume();
			}
		}
		else if(spaces == true) {
			
			if(!(Character.isDigit(testInput) || Character.isWhitespace(testInput))) {
				//Consume will default the input back to before a key was pressed
				e.consume();
			}
		}
	}
	
	
//Double Input Only
									//Client code to specific to restrict space input or not
	public static void doubleInputOnly(Boolean spaces, Integer numberOfDoubles, KeyEvent e) {
			
		counterForDouble++;
			
		char testInput = e.getKeyChar();
		String inputToString = "";
			
		if(spaces == false || numberOfDoubles <= 1) {
				
			if(!(Character.isDigit(testInput) || Character.toString(testInput).equals("."))) {
				e.consume();
			}
			else
			doubleValidEntryCounter++;
			inputToString = Character.toString(testInput);
			System.out.println(doubleValidEntryCounter + ": " + inputToString);
		}
			
		else if(spaces == true) {
				
			if(!(Character.isDigit(testInput) || Character.toString(testInput).equals(".") || Character.isSpaceChar(testInput))) {
				e.consume();
			}
			else
			doubleValidEntryCounter++;
			inputToString = Character.toString(testInput);
			System.out.println(doubleValidEntryCounter + ": " + inputToString);
		}
	}
	
	
//Alphabet Input Only
									//Client code to specific to restrict space input or not
	public static void alphabetInputOnly(Boolean spaces, KeyEvent e) {
		
		char testInput = e.getKeyChar();
		
		if(spaces == false) {
			if(!(Character.isAlphabetic(testInput))) {
				e.consume();
			}
		}
		else if (spaces == true) {
			if(!(Character.isAlphabetic(testInput) || Character.isSpaceChar(testInput))) {
				e.consume();
			}
		}
	}
	
	
//White Space Input Only
	public static void whiteSpaceInputOnly(KeyEvent e) {
		
		char testInput = e.getKeyChar();
		
		if(!(Character.isWhitespace(testInput))) {
			e.consume();
		}
	}
}