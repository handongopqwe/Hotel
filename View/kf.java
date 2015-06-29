package roomMannger;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import dao.ShDao;
import dao.kfDao;
import entity.RmesCourse;
import DBjavaCon.DBcon;
public class kf implements ActionListener {
	private static String xxzz;
	private int a[];

	public static String getXxzz() {
		return xxzz;
	}

	public static void setXxzz(String xxzz) {
		kf.xxzz = xxzz;
	}

	public kf(int[] a) {
		this.a = a;
		init();
	}
	String Sh;
	private String xz;
	Panel q, x, y, z, z1,l1;
	Frame g;
	Choice p;
	Button a1, a2;
	Label b1, b2, b3, b4, b5, b6,b7,b8,b9;
	TextField l;
	ResultSet mm,tt,pp;
	String sql = "select Rxm,Rsfid,Rroom from Ruzhu where Rroom='"+ kf.getXxzz() + "'";
	String sql1 = "select Rsh from Ruzhu where Rroom='"+ kf.getXxzz() + "'";
	public void init() {
		xx();
		g.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);

			}

		});
	}

	public void xx() {
		g = new Frame("The customer information to see");
		q = new Panel();
		x = new Panel();
		y = new Panel();
		z = new Panel();
		z1 = new Panel();
		l1=new Panel();
		g.add(y);
		g.add(x);
		g.add(q);
		g.add(l1);
		y.add(z);
		y.add(z1);
		g.setLayout(new GridLayout(4, 0)); 
		g.setBounds(300, 100, 700, 500);
		y.setLayout(new GridLayout(0, 2)); 
		z.setLayout(new GridLayout(4, 0)); 
		b6 = new Label("customer information");
		b1 = new Label(); 
		b2 = new Label();
		b3 = new Label();
		b7 = new Label("Damage to the product listing£º");
		b8 = new Label();
		l=new TextField();
		b6.setFont(new Font("", 1, 30));
		z1.setLayout(new GridLayout(0, 2));
		b5 = new Label("Change room£º");
		p = new Choice(); 
		b5.setFont(new Font("", 1, 20));
		p.setFont(new Font("", 1, 10));
		p.setSize(50, 50);
		x.setLayout(new GridLayout(0, 2, 10, 10)); 
		b4 = new Label("Damage to the goods entry£º");
		b4.setFont(new Font("", 1, 30));
		b7.setFont(new Font("", 1, 30));
		q.setLayout(null);
		l1.setLayout(new GridLayout(0,2));
		a1 = new Button("confirm");
		a2 = new Button("go back");
		a1.setBounds(250, 50, 100, 50);
		a2.setBounds(360, 50, 100, 50);
		b8.setFont(new Font("",1,20));
		p.add("301");
		p.add("302");
		p.add("303");
		p.add("304");
		p.add("305");
		p.add("306");
		z.add(b6);
		z.add(b1);
		z.add(b2);
		z.add(b3);
		z1.add(b5);
		z1.add(p);
		x.add(b4);
		x.add(l);
		q.add(a1);
		q.add(a2);
		l1.add(b7);
		l1.add(b8);
		g.setVisible(true);
		a1.addActionListener(this);
		a2.addActionListener(this);
		g.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		DBcon z1 = new DBcon();
		tt = z1.doSelect(sql1);
		try {
			tt.next();
			b8.setText( tt.getString(1));
			z1.close(tt);
		} catch (Exception ce) {
			System.out.println("cuowu");

		}
		DBcon z = new DBcon();
		mm = z.doSelect(sql);
		try {
			mm.next();
			b1.setText("Name" + mm.getString(1));
			b2.setText( "ID number"+mm.getString(2));
			b3.setText("RoomID" + mm.getString(3));
			z.close(mm);
		} catch (Exception ce) {
			System.out.println("cuowu");

		}
		b1.setFont(new Font("", 1, 17));
		b2.setFont(new Font("", 1, 17));
		b3.setFont(new Font("", 1, 17));
	}

	public void actionPerformed(ActionEvent arg0) {
		if (a2.equals(arg0.getSource())) {
			g.dispose();
			Text.main(null);
		} 
		 if(a1.equals(arg0.getSource())) {
			Sh =l.getText();
			xz = p.getSelectedItem();
			RmesCourse m = new RmesCourse();
			m.setXz(xz);
			m.setSh(Sh);
			int t = Integer.parseInt(xz);
			m.setPdxz(xz);
			  if ( a[t-301] == 1) 
			 {
				  g.dispose();				  
				Text.main(null);								
			 }

			  else {
				  if (xz.equals(kf.getXxzz())) {
					  g.dispose();
						Text.main(null);											   
					  }
				else {
					
					kfDao tb = new kfDao();
					tb.pddCourse(m);
					ShDao ta = new ShDao();
					ta.dddCourse(m);
					g.dispose();
					Text.main(null);
					
				}
			}
		}
	}
}
