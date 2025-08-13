import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener {
    public JFrame fobj;
    public JButton addButton, subButton, mulButton, divButton;
    public JTextField tNo1, tNo2, tResult;
    public JLabel labellNo1, labelNo2, labelResult;

    public Calculator(String Title, int Width, int Height) {
        fobj = new JFrame();
        fobj.setTitle(Title);
        fobj.setSize(Width, Height);
        fobj.setLayout(null);

        labellNo1 = new JLabel("No1:");
        labellNo1.setBounds(50, 30, 100, 30);
        fobj.add(labellNo1);

        labelNo2 = new JLabel("No2:");
        labelNo2.setBounds(50, 70, 100, 30);
        fobj.add(labelNo2);

        labelResult = new JLabel("Result:");
        labelResult.setBounds(50, 190, 100, 30);
        fobj.add(labelResult);

        tNo1 = new JTextField();
        tNo1.setBounds(150, 30, 150, 30);
        fobj.add(tNo1);

        tNo2 = new JTextField();
        tNo2.setBounds(150, 70, 150, 30);
        fobj.add(tNo2);

        tResult = new JTextField();
        tResult.setBounds(150, 190, 150, 30);
        tResult.setEditable(false);
        fobj.add(tResult);

        addButton = new JButton("+");
        addButton.setBounds(50, 120, 50, 30);
        addButton.addActionListener(this);
        fobj.add(addButton);

        subButton = new JButton("-");
        subButton.setBounds(110, 120, 50, 30);
        subButton.addActionListener(this);
        fobj.add(subButton);

        mulButton = new JButton("*");
        mulButton.setBounds(170, 120, 50, 30);
        mulButton.addActionListener(this);
        fobj.add(mulButton);

        divButton = new JButton("/");
        divButton.setBounds(230, 120, 50, 30);
        divButton.addActionListener(this);
        fobj.add(divButton);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fobj.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) 
    {
        try {
            double no1 = Double.parseDouble(tNo1.getText());
            double no2 = Double.parseDouble(tNo2.getText());
            double result = 0;

            if (ae.getSource() == addButton) {
                result = no1 + no2;
            } else if (ae.getSource() == subButton) {
                result = no1 - no2;
            } else if (ae.getSource() == mulButton) {
                result = no1 * no2;
            } else if (ae.getSource() == divButton) {
                if (no2 != 0) {
                    result = no1 / no2;
                } else {
                    tResult.setText("Error: Divide by 0");
                    return;
                }
            }

            tResult.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            tResult.setText("Invalid Input");
        }
    }
}

class Calculator2 {
    public static void main(String A[]) {
        new Calculator("Calculator", 400, 300);
    }
}
