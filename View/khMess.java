package roomMannger;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import dao.khMesDao;
import entity.khCourse;
public class khMess {	
	public static void main(String[] args) {
		new VListener();
		}
	}
class VListener implements ActionListener{
	//
	String xm,xb,ch,sfid,zz;
	TextField b1,b2,b3,b4,b5;
	Button a1,a2;
	Frame khh;
	public void tt(){			
		khh=new Frame("Level of customer information");
		khh.setLayout(new GridLayout(0,2,5,5));
		khh.setBounds(300,200,400,400);
		 a1=new Button("submit");
		 a2=new Button("go back");
		b1=new TextField(5);	
		 b2=new TextField(5);
		 b3=new TextField(5);
		 b4=new TextField(5);
		 b5=new TextField(5);
		Label c1=new  Label("Name");
		Label c2=new  Label("Sex");
		Label c3=new  Label("date of birth");
		Label c4=new  Label("ID number");
		Label c5=new  Label("Addres");
		khh.add(c1);
		khh.add(b1);
		khh.add(c2);
		khh.add(b2);
		khh.add(c3);
		khh.add(b3);
		khh.add(c4);
		khh.add(b4);
		khh.add(c5);
		khh.add(b5);
		khh.add(a1);
		a1.addActionListener(this);
		a2.addActionListener(this);
		khh.add(a2);
		khh.setVisible(true);
		khh.addWindowListener(new WindowAdapter() {		

			public void windowClosing(WindowEvent e) {
			System.exit(0);

			}

			});		
	}	
	public VListener(){
		tt();
	}
	public void actionPerformed(ActionEvent s)
	{
		if(a2.equals(s.getSource())){
			Text.main(null);
			khh.dispose();
		}
		else{
	xm=b1.getText();
	xb=b2.getText();
	ch=b3.getText();
	sfid=b4.getText();
	zz=b5.getText();
		khCourse c=new khCourse();
		c.setXm(xm);
		c.setXb(xb);
		c.setCh(ch);
		c.setSfid(sfid);
		c.setZz(zz);
		khMesDao db=new khMesDao();
		db.addCourse(c);
		Text.main(null);
		khh.dispose();}
	}
}
	
	

