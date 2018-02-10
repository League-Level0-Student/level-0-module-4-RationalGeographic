

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String qw = JOptionPane.showInputDialog("Gimme a number bro");
		int nm = Integer.parseInt(qw);
		String rt = JOptionPane.showInputDialog("Gimme another number");
		int vb = Integer.parseInt(rt);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What do you want to do with " + nm + " and " + vb, "Simple Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide", "Anmsomeness" },
				null);
if(operation == 0) {
	add(nm , vb);
	System.out.println(add(nm , vb));
}
if(operation == 1)	{
subtract(nm, vb)	;
System.out.println(subtract(nm, vb));
}
if(operation == 2)	{
multiply(nm, vb)	;
System.out.println(multiply(nm, vb));
}
if(operation == 3)	{
divide(nm, vb)	;
System.out.println(divide(nm, vb));
}
if(operation == 4) {
	System.out.println(beAwesome());
}


// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

//add(0);
	}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	static int add(int we,  int ty ) {
		int answer = we + ty;
return answer;
	}
static int subtract(int we, int ty) {
	int answer = we - ty;
	return answer;
}
static int multiply(int we, int ty) {
	int answer = we * ty;
	return answer;
}
static int divide(int we, int ty) {
	int answer = we / ty;
	return answer;
}
static String beAwesome() {
	String hip = "Be awesome!!";
	return hip;
}



// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	
		// 4. Create similar methods for subtraction, multiplication and division.
}