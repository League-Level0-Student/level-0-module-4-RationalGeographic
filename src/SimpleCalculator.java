

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String qw = JOptionPane.showInputDialog("Gimme a number bro");
		int we = Integer.parseInt(qw);
		String rt = JOptionPane.showInputDialog("Gimme another number");
		int ty = Integer.parseInt(rt);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" },
				null);
if(operation == 0) {
	add(we , ty);
	System.out.println(add(we , ty));
}
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
//add(0);
	}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	static int add(int we,  int ty ) {
		int answer = we + ty;
return answer;
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	
	}	// 4. Create similar methods for subtraction, multiplication and division.
}