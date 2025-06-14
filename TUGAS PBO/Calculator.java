import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private String operator = "";
    private double num1 = 0, num2 = 0, result = 0;
    private boolean startNewNumber = true;

    public Calculator() {
        setTitle("Kalkulator Sederhana");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Membuat JTextField
        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        add(textField, BorderLayout.NORTH);

        // Panel tombol
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 6, 5, 5));

        // Daftar tombol sesuai gambar
        String[] buttons = {
            "1", "2", "3", "4", "5", "6",
            "7", "8", "9", "0", "+", "-",
            "*", "/", "=", "%", "Mod", "Exit"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("Exit")) {
            System.exit(0);
        } else if ("0123456789".contains(cmd)) {
            if (startNewNumber) {
                textField.setText(cmd);
                startNewNumber = false;
            } else {
                textField.setText(textField.getText() + cmd);
            }
        } else if ("+-*/%Mod".contains(cmd)) {
            operator = cmd;
            num1 = Double.parseDouble(textField.getText());
            startNewNumber = true;
        } else if (cmd.equals("=")) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num2 != 0 ? num1 / num2 : 0; break;
                case "%": result = num1 % num2; break;
                case "Mod": result = num1 % num2; break;
            }
            textField.setText("" + result);
            startNewNumber = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }
}
