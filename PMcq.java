import java.awt.event.*;
import java.awt.*;
import java.util.*;
class PMcq extends Frame implements ActionListener, ItemListener,Runnable
 {
     Image no,yes;
     Label l,res,tm,per,dt,name;
     int r=0,i=0,sc=30,tq=0;
     Checkbox b1,b2,b3,b4;
     Button b9;
     String uans="",uname="";
     CheckboxGroup cg;
     ArrayList<Question> que;
     PMcq()
     {
       setSize(600,320);
       setLocation(300,200);
       setResizable(false);
       java.util.Date d=new java.util.Date();
       no=Toolkit.getDefaultToolkit().getImage("no.PNG");
       yes=Toolkit.getDefaultToolkit().getImage("yes.JPG");
       Font f=new Font("Arial", Font.BOLD,30);
       que=new ArrayList();
setLayout(null);
       cg=new CheckboxGroup();
       res=new Label("Result="+0);
       dt=new Label("      Today is "+d.getDate()+"-"+(d.getMonth()+1)+"-"+(d.getYear()+1900));
       dt.setBackground(Color.yellow);
       dt.setForeground(Color.blue);
       res.setFont(new Font("Arial",Font.BOLD,15));
       per=new Label("   Multiple Choice Quiz");
       name=new Label("Welcome User");
       per.setFont(f);
per.setBackground(Color.blue);
        per.setForeground(Color.yellow);
       l=new Label();
       l.setFont(new Font("Arial",Font.BOLD,11));
        tm=new Label();
       tm.setFont(new Font("Arial",Font.BOLD,15));
       b1=new Checkbox("",cg,false);
       b2=new Checkbox("",cg,false);
       b3=new Checkbox("",cg,false);
       b4=new Checkbox("",cg,false);
b1.setFont(new Font("Arial",Font.BOLD,11));
       b2.setFont(new Font("Arial",Font.BOLD,11));
       b3.setFont(new Font("Arial",Font.BOLD,11));
       b4.setFont(new Font("Arial",Font.BOLD,11));
	
	b9=new Button("Next");
        b9.setBackground(Color.green);
       res.setBounds(70,80,150,20); tm.setBounds(390,80,150,20);
       per.setBounds(100,20,350,30);
       name.setBounds(60,55,200,20);
       l.setBounds(90,105,300,30);
b1.setBounds(100,140,150,30);
       b2.setBounds(260,140,150,30);
       b3.setBounds(100,180,150,30);
       b4.setBounds(260,180,150,30);
       	b9.setBounds(390,220,100,30);
        dt.setBounds(100,260,350,30);
        dt.setFont(new Font("Arial", Font.BOLD,25));
         b9.setFont(new Font("Arial",Font.BOLD,15));
	    b1.addItemListener(this);
            b2.addItemListener(this);
            b3.addItemListener(this);
            b4.addItemListener(this);
         b9.addActionListener(this);
       add(b9);add(dt);add(b1);add(b2);add(b3);add(b4);add(l);add(res);add(tm);add(per);add(name);
	setVisible(true);
        loadQue();
    }
    void loadQue()
    {
        Thread t=new Thread(this);
        t.start();
   
        que.add(new Question("What is name of java compiler?","java","javac","javad","javap","javac"));
        que.add(new Question("What is name of java interpreter?","java","javac","javad","javap","java"));
que.add(new Question("What is full form of JVM?","java video machine","java virtual machine","java van machine","none","java virtual machine"));
        que.add(new Question("What is public?","variable","keyword","method","none","keyword"));
        que.add(new Question("Choose comparision operator","=","===","==","equal","=="));
        que.add(new Question("Package is used for event handling","java.awt","java.io","java.awt.event","java.lang","java.awt.event"));
que.add(new Question("sleep() method throw ........Exception","Interrpted","IOException","ClassNotFound","none","Interrpted"));        
        que.add(new Question("Applet is part of ...package","java.awt","java.applet","java.sql","java.net","java.applet"));
        que.add(new Question("What is super?","access base class member","Base constructor","Base class variable","All of the above","All of the above"));
        
     
      Collections.shuffle(que);
       tq=que.size();
    }
public void run()
     {
           try
           {
                while(true)
               {
                 if(sc==0)
                 {
                       sc=30;
                        i++;
                        cg.setCurrent(null);
                        repaint();
                }
if(sc<=30&&sc>=20)
                  tm.setForeground(Color.green);
               else if(sc<=19&&sc>=10)
                  tm.setForeground(Color.orange);
               else
                 tm.setForeground(Color.red);
                tm.setText("00:00:"+sc);
                Thread.sleep(1000);
                sc--; 
                }  
           }
catch(InterruptedException ie)
           {}
      }
    public void paint(Graphics g)
    {
          if(cg.getCurrent()==null)
              g.drawImage(no,410,100,100,100,this);
            else
               g.drawImage(yes,410,100,100,100,this);
l.setText("Q"+(i+1)+" "+que.get(i).qt);
           b1.setLabel(que.get(i).op1);
           b2.setLabel(que.get(i).op2);
           b3.setLabel(que.get(i).op3);
           b4.setLabel(que.get(i).op4);
     }
public void itemStateChanged(ItemEvent e)
     {
       repaint();
      uans=(String)e.getItem();
     }
public void actionPerformed(ActionEvent e)
   {
      sc=31;
     if((que.get(i).ans).equals(uans))
     {  
        r=r+1; res.setText("Result="+r);
     }
if(i<que.size()-1)
        i++;
       else
        {
  new ResWin(r);
          setVisible(false);
        }
      cg.setCurrent(null);
     repaint();
   }	
}