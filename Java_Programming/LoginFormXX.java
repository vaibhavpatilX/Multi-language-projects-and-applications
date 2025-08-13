import javax.swing.*;
import java.awt.event.*;
//import java.awt.Frame;
//import java.awt.Container;
import java.awt.Color;


class MarvellousLogin implements ActionListener 
{
    public JFrame fobj;
    public JButton bobj;
    public JTextField tobj;
    public JPasswordField pobj;
    public JLabel UserLabel , PassLabel , ResultLabel;

    public MarvellousLogin(String Title, int Width, int Height)
    {
        fobj = new JFrame();

        UserLabel = new JLabel("UserName");
        UserLabel.setBounds(50,50,100,30);

        tobj = new JTextField();
        tobj.setBounds(150,50,150,30);

        PassLabel = new JLabel("Password");
        PassLabel.setBounds(50,100,100,30);

        pobj = new JPasswordField();
        pobj.setBounds(150,100,150,30);

        bobj = new JButton("SUBMIT..?");
        bobj.setBounds(150,150,100,30);

        ResultLabel = new JLabel("");
        ResultLabel.setBounds(100,200,250,30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(pobj);
        fobj.add(UserLabel);
        fobj.add(PassLabel);
        fobj.add(ResultLabel);

        bobj.addActionListener(this);
        fobj.setLayout(null);   

        fobj.setTitle(Title);
        fobj.setSize(Width , Height);
        fobj.getContentPane().setBackground(Color.YELLOW);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj)
    {
        String uname = tobj.getText();
        String pass = new String(pobj.getPassword());

        //ResultLabel.setText("Button Clicked..!");

        if((uname.equals("Marvellous")) && (pass.equals("Marvellous@1121")))
        {
            ResultLabel.setText("Login Successfull..!");
        }
        else
        {
            ResultLabel.setText("Unable to Login");
        }
    }
}

class LoginFormXX
{
    public static void main(String A[])
    {
        /*
        System.out.println("Enter Width: ");
        Scanner sobj = new Scanner();
        */
       
        MarvellousLogin mobj = new MarvellousLogin("Marvellous Login..!",400,300);
    }
}