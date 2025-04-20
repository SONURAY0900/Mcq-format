import java.awt.event.*;
import java.awt.*;
import java.util.*;
class LoginPMcq extends Frame implements ActionListener
 {
     Label per,dt,name,pass;
     Button b9;
     String uans="",uname="";
     TextField t,pw;
     LoginPMcq()
     {
       setSize(600,350);
       setLocation(300,200);
       setResizable(false);
       java.util.Date d=new java.util.Date();
       Font f=new Font("Arial", Font.BOLD,30);
        setLayout(null);
      dt=new Label("      Today is "+d.getDate()+"-"+(d.getMonth()+1)+"-"+(d.getYear()+1900));
       dt.setBackground(Color.yellow);
       dt.setForeground(Color.blue);
       per=new Label("   Multiple Choice Quiz");
       name=new Label("Enter User Name");
        t=new TextField();
      pass=new Label("Enter Password");
       pw=new TextField();
      pw.setEchoChar('*');
       
       per.setFont(f);
        per.setBackground(Color.blue);
        per.setForeground(Color.yellow);
      
	b9=new Button("Login");
        b9.setBackground(Color.green);
       per.setBounds(100,35,350,30);
       name.setBounds(60,75,150,20);
        t.setBounds(220,75,150,20);
       pass.setBounds(60,100,150,20);
        pw.setBounds(220,100,150,20);

       	b9.setBounds(390,220,100,30);
        dt.setBounds(100,260,350,30);
        dt.setFont(new Font("Arial", Font.BOLD,25));
         b9.setFont(new Font("Arial",Font.BOLD,15));
	 b9.addActionListener(this);
       add(b9);add(dt);add(per);add(name);add(pass);add(pw);add(t);
setVisible(true);
    }
   public void actionPerformed(ActionEvent e)
   {
     if((t.getText().equals("user"))&&(pw.getText().equals("123")))
           new PMcq();
       }
   public static void main(String args[])
   {
      new LoginPMcq();
   }
}