import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class testingOptionDialogs {
  public static void main(String[] a) {
    String[] choices = { "A",  "B", "C", "D", "E", "F" };
    String input = (String) JOptionPane.showInputDialog(null, "Choose now...",
        "The Choice of a Lifetime", JOptionPane.QUESTION_MESSAGE, null, // Use
                                                                        // default
                                                                        // icon
        choices, // Array of choices
        choices[0]); // Initial choice
    System.out.println(input);
  




    
        final JPanel panel = new JPanel();
        final JRadioButton button1 = new JRadioButton("1");
        final JRadioButton button2 = new JRadioButton("im a mushroom");

        panel.add(button1);
        panel.add(button2);

        JOptionPane.showMessageDialog(null, panel);
        if(button2.isSelected()) {
        	System.out.println("hi");
        }
  }}
//shareimprove this answer






