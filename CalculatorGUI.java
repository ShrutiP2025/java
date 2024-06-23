import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame implements ActionListener {
    private JTextField displayField;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton clearButton;
    private JButton equalsButton;

    private double firstNumber;
     String operator;

    public CalculatorGUI() {
        setTitle("Simple Calculator");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));
        displayField = new JTextField();
        displayField.setEditable(false);
        panel.add(displayField);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            panel.add(numberButtons[i]);
        }

        operatorButtons = new JButton[4];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");
        for (JButton button : operatorButtons) {
            button.addActionListener(this);
            panel.add(button);
        }

        clearButton = new JButton("C");
        clearButton.addActionListener(this);
        panel.add(clearButton);

        equalsButton = new JButton("=");
        equalsButton.addActionListener(this);
        panel.add(equalsButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
     {
        String command = e.getActionCommand();

        if (Character.isDigit(command.charAt(0))) {
            displayField.setText(displayField.getText() + command);
        } else if ("+-*/".contains(command)) {
            firstNumber = Double.parseDouble(displayField.getText());
            operator = command;
            displayField.setText("");
        } else if (command.equals("=")) {
            double secondNumber = Double.parseDouble(displayField.getText());
            double result = 0;

            if (operator.equals("+")) {
               
                result = firstNumber + secondNumber;
            } else if (operator.equals("-")) {
                
                result = firstNumber - secondNumber;
            } else if (operator.equals("*")) {
                
                result = firstNumber * secondNumber;
            } else if (operator.equals("/")) {
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // Handle invalid operator
            }

            displayField.setText(String.valueOf(result));
        } else if (command.equals("C")) {
            displayField.setText("");
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}