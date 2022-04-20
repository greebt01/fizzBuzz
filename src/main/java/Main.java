import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int myNumber = Integer.parseInt(JOptionPane.showInputDialog("Number:"));
        if (myNumber%5==0&&myNumber%3==0) {
            JOptionPane.showMessageDialog(null,"FizzBuzz");
        } else if (myNumber%3==0) {
            JOptionPane.showMessageDialog(null, "Buzz");
        } else if (myNumber%5==0) {
            JOptionPane.showMessageDialog(null, "Fizz");
        } else {
            JOptionPane.showMessageDialog(null, myNumber);
        }
    }
}