/*
                Experiment -13

Write a program to create a window with four text fields for the name,
street, city and pincode with suitable labels.
Also windows contains a button MyInfo.
When the user types the name, his street, city and pincode and then clicks the button, 
the types details must appear in Arial Font with Size 32, Italics.

*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
    Label l_name;
    Label l_street;
    Label l_city;
    Label l_pincode;
    TextField t_name;
    TextField t_street;
    TextField t_city;
    TextField t_pincode;
    JTextArea user_details = new JTextArea("");
    Button b;

    public MyFrame()
    {
        super("Button Demo");
        //closing the frame
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        Font font1 = new Font("Arial", Font.ITALIC, 32);
        user_details.setEditable(false);
        user_details.setFont(font1);
        l_name=new Label("Name :    ");
        l_street=new Label("Street :    ");
        l_city=new Label("City :    ");
        l_pincode =new Label("Pin code :    ");

        l_name.setBounds(50,50,40,20);
        l_street.setBounds(50,80,40,20);
        l_city.setBounds(50,110,40,20);
        l_pincode.setBounds(50,140,40,20);
        user_details.setBounds(50,220,250,150);

        t_name=new TextField();
        t_street=new TextField();
        t_city=new TextField();
        t_pincode=new TextField();

        t_name.setBounds(110,50,200,20);
        t_street.setBounds(110,80,200,20);
        t_city.setBounds(110,110,200,20);
        t_pincode.setBounds(110,140,200,20);

        b=new Button("Check");
        b.setBounds(100,180,50,20);
        b.addActionListener(this);


        setLayout(null);
        setSize(300,500);
        add(l_name);
        add(l_street);
        add(l_city);
        add(l_pincode);
        add(t_name);
        add(t_street);
        add(t_city);
        add(t_pincode);
        add(user_details);
        add(b);



    }

    public void actionPerformed(ActionEvent e)
    {
        String user="";
        boolean test=true;
        if(!t_name.getText().trim().isEmpty())
        {
            user="Name :"+t_name.getText();
        }
        else
        {
            test=false;
        }
        if(!t_street.getText().trim().isEmpty())
        {
            user+="\nStreet :"+t_street.getText();
        }
        else
        {
            test=false;
        }
        if(!t_city.getText().trim().isEmpty())
        {
            user+="\nCity :"+t_city.getText();
        }
        else
        {
            test=false;
        }
        if(!t_pincode.getText().trim().isEmpty())
        {
            user+="\nPin Code:"+t_pincode.getText();
        }
        else
        {
            test=false;
        }
        //System.out.println(user);
        if(!test)
        {
            user_details.setText("Enter values in all the fields");
        }
        else {
            user_details.setText(user);
        }

    }
}

public class ButtonDemo
{
    public static void main(String[] args)
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);


    }
}