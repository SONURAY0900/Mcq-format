import java.awt.event.*;
import java.awt.*;
import java.util.*;
class ResWin extends Frame implements ActionListener
 {
     Label per,dt,name,pass,gm;
     Button b9,b8;
     String uans="",uname="";
     TextField t,pw;
     ResWin(int r)
     {
setSize(500,320);
       setLocation(300,200);
       setResizable(false);
       java.util.Date d=new java.util.Date();
       Font f=new Font("Arial", Font.BOLD,30);
        setLayout(null);
       dt=new Label("      Today is "+d.getDate()+"-"+(d.getMonth()+1)+"-"+(d.getYear()+1900));
       dt.setBackground(Color.yellow);
       dt.setForeground(Color.blue);
       per=new Label("   Multiple Choice Quiz");
       name=new Label("Thank You!");
pass=new Label("Your Score:"+r);
       pass.setFont(new Font("Arial",Font.BOLD,20)); 
       per.setFont(f);
        per.setBackground(Color.blue);
        per.setForeground(Color.yellow); 

      int n = (int)(((double) r / 9) * 100);
      gm=new Label("Your Percentage:"+n+"%");
       gm.setFont(new Font("Arial",Font.BOLD,20)); 
 
	b9=new Button("Retest");
        b9.setBackground(Color.green);

         b8=new Button("Exit");
        b8.setBackground(Color.green);
       b8.setBounds(390,220,100,30);
      b8.setFont(new Font("Arial",Font.BOLD,15));
	 b8.addActionListener(this);

       per.setBounds(100,20,350,30);
       name.setBounds(60,75,150,20);
       pass.setBounds(70,90,150,40);
       gm.setBounds(70,130,230,40);

       	b9.setBounds(280,220,100,30);
dt.setBounds(100,260,350,30);
        dt.setFont(new Font("Arial", Font.BOLD,25));
         b9.setFont(new Font("Arial",Font.BOLD,15));
	 b9.addActionListener(this);
       add(b9);add(dt);add(per);add(name);add(pass);add(gm);add(b8);
	setVisible(true);
    }
   public void actionPerformed(ActionEvent e)
   {
        if(e.getSource()==b9){
              this.dispose();
          } else  if(e.getSource()==b8){
              System.exit(0);
            }
   }
}