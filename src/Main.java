import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CircleAreaCalculator extends JFrame {
    private JTextField radiusField;
    private JLabel resultLabel;
    public CircleAreaCalculator() {
        setTitle("Обчислення площі кола");
        setPreferredSize(new Dimension(500, 150));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        radiusField = new JTextField();
        JLabel radiusLabel = new JLabel("Радіус:");
        resultLabel = new JLabel();

        JButton calculateButton = new JButton("Обчислити");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double radius = Double.parseDouble(radiusField.getText());
                    double area = Math.PI * radius * radius;
                    resultLabel.setText("Площа кола: " + area);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Неправильне значення радіуса!");
                }
            }
        });

        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        panel.add(radiusLabel);
        panel.add(radiusField);
        panel.add(calculateButton);
        panel.add(resultLabel);
        getContentPane().add(panel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}

public class Main {
    public static void main(String[] args) {
        new CircleAreaCalculator();
    }

}