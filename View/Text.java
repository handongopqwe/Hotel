package roomMannger;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.util.Iterator;
import dao.RmesDao;
import entity.RmesCourse;
import entity.RuzhuCourse;
public class Text {
	public static void main(String[] args) {
		new Vitener();
	}
}

class Vitener implements ActionListener {
	//
	int[] x = new int[6];
	Frame zy, kh;
	Panel o;
	Button a1, a2, a3, b1, b2, b3, b4, b5, b6, c1,c2;
	ResultSet s;
	RmesDao db;
	RmesCourse pd = new RmesCourse();
	public int[] a = new int[6];

	public void tt() {
		kh = new Frame("NO1 -Hotel Mannger");
		kh.setLayout(new GridLayout(0, 2, 5, 5));
		kh.setBounds(300, 200, 400, 400);
		a1 = new Button("Client Data Registration Form");
		a2 = new Button("Check-in room registration");
		b1 = new Button("301");
		b1.setBackground(Color.GREEN);
		b2 = new Button("302");
		b2.setBackground(Color.GREEN);
		b3 = new Button("303");
		b3.setBackground(Color.GREEN);
		b4 = new Button("304");
		b4.setBackground(Color.GREEN);
		b5 = new Button("305");
		b5.setBackground(Color.GREEN);
		b6 = new Button("306");
		b6.setBackground(Color.GREEN);
		c1 = new Button("exit");
		c2 = new Button("Check out");
		// .addActionListener(this);
		if(b1.getBackground()==Color.GREEN){
			a[0]=0;
		}
		if(b2.getBackground()==Color.GREEN){
			a[1]=0;
		}
		if(b3.getBackground()==Color.GREEN){
			a[2]=0;
		}
		if(b4.getBackground()==Color.GREEN){
			a[3]=0;
		}
		if(b5.getBackground()==Color.GREEN){
			a[4]=0;
		}
		if(b6.getBackground()==Color.GREEN){
			a[5]=0;
		}
		kh.add(a1);
		kh.add(a2);
		kh.add(b1);
		kh.add(b2);
		kh.add(b3);
		kh.add(b4);
		kh.add(b5);
		kh.add(b6);
		kh.add(c1);
		kh.add(c2);
		a1.addActionListener(this);
		a2.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		c1.addActionListener(this);
		c2.addActionListener(this);
		kh.setVisible(true);
		db = new RmesDao();
		String sql = "select * from Ruzhu";
		java.util.List<RuzhuCourse> list = db.getAll(sql);
		Iterator<RuzhuCourse> iter = list.iterator();
		while (iter.hasNext()) {
			RuzhuCourse oc = iter.next();
			
			//if(b1.getBackground().)
			if (b1.getLabel().equals(oc.getRuzhufj())) {
				b1.setBackground(Color.RED);
				a[0]=1;
			}
			 if (b2.getLabel().equals(oc.getRuzhufj())) {
				b2.setBackground(Color.RED);
				a[1]=1;
			}
			 if (b3.getLabel().equals(oc.getRuzhufj())) {
				b3.setBackground(Color.RED);
				a[2]=1;
			}
			 if (b4.getLabel().equals(oc.getRuzhufj())) {
				b4.setBackground(Color.RED);
				a[3]=1;
			}
			 if (b5.getLabel().equals(oc.getRuzhufj())) {
				b5.setBackground(Color.RED);
				a[4]=1;
			}
			
			 if (b6.getLabel().equals(oc.getRuzhufj())) {
				b6.setBackground(Color.RED);
				a[5]=1;
			}
			
			kh.invalidate();
		}
		kh.addWindowListener(new WindowAdapter() { 

			public void windowClosing(WindowEvent e) {
				System.exit(0);

			}

		});
	}

	public Vitener() {
		tt();
	}

	public void actionPerformed(ActionEvent e) {
		if (a1.equals(e.getSource())) {
			khMess.main(null);
			kh.dispose();
		}

		else if (a2.equals(e.getSource())) {

			RuzhuMess.main(null);
			kh.dispose();
		} else if (c1.equals(e.getSource())) {
			System.exit(0);
		}
		else if(c2.equals(e.getSource())){
			
			new Tf();
		}
		else {
			if (b1.equals(e.getSource())
					&& b1.getBackground().equals(Color.GREEN)) {
				final Frame JG = new Frame("Warning");
				Label jjg = new Label("Nobody in this Room");
				JG.setLayout(new GridLayout(2, 0));
				JG.setBounds(400, 300, 200, 100);
				jjg.setFont(new Font("", 1, 20));
				JG.add(jjg);
				JG.addWindowListener(new WindowAdapter() { 

					public void windowClosing(WindowEvent e) {
						JG.dispose();

					}

				});
				JG.setVisible(true);
			} else if (b1.equals(e.getSource())
					&& !b1.getBackground().equals(Color.GREEN)) {
				
				kf.setXxzz(e.getActionCommand());
				new kf(a);
				kh.dispose();
			} else if (b2.equals(e.getSource())
					&& b2.getBackground().equals(Color.GREEN)) {
				final Frame JG = new Frame("Warning");
				Label jjg = new Label("Nobody in this Room");
				JG.setLayout(new GridLayout(2, 0));
				JG.setBounds(400, 300, 200, 100);
				jjg.setFont(new Font("", 1, 20));
				JG.add(jjg);
				JG.addWindowListener(new WindowAdapter() { 

					public void windowClosing(WindowEvent e) {
						JG.dispose();

					}

				});
				JG.setVisible(true);
			} else if (b2.equals(e.getSource())
					&& !b2.getBackground().equals(Color.GREEN)) {
			
				kf.setXxzz(e.getActionCommand());
				new kf(a);
				kh.dispose();

			} else if (b3.equals(e.getSource())
					&& b3.getBackground().equals(Color.GREEN)) {
				final Frame JG = new Frame("Warning");
				Label jjg = new Label("Nobody in this Room");
				JG.setLayout(new GridLayout(2, 0));
				JG.setBounds(400, 300, 200, 100);
				jjg.setFont(new Font("", 1, 20));
				JG.add(jjg);
				JG.addWindowListener(new WindowAdapter() {

					public void windowClosing(WindowEvent e) {
						JG.dispose();

					}

				});
				JG.setVisible(true);
			} else if (b3.equals(e.getSource())
					&& !b3.getBackground().equals(Color.GREEN)) {
			
				kf.setXxzz(e.getActionCommand());
				new kf(a);
				kh.dispose();

			} else if (b4.equals(e.getSource())
					&& b4.getBackground().equals(Color.GREEN)) {
				final Frame JG = new Frame("Warning");
				Label jjg = new Label("Nobody in this Room");
				JG.setLayout(new GridLayout(2, 0));
				JG.setBounds(400, 300, 200, 100);
				jjg.setFont(new Font("", 1, 20));
				JG.add(jjg);
				JG.addWindowListener(new WindowAdapter() { 

					public void windowClosing(WindowEvent e) {
						JG.dispose();

					}

				});
				JG.setVisible(true);
			} else if (b4.equals(e.getSource())
					&& !b4.getBackground().equals(Color.GREEN)) {
				
				kf.setXxzz(e.getActionCommand());
				new kf(a);
				kh.dispose();
			} else if (b5.equals(e.getSource())
					&& b5.getBackground().equals(Color.GREEN)) {
				final Frame JG = new Frame("Warning");
				Label jjg = new Label("Nobody in this Room");
				JG.setLayout(new GridLayout(2, 0));
				JG.setBounds(400, 300, 200, 100);
				jjg.setFont(new Font("", 1, 20));
				JG.add(jjg);
				JG.addWindowListener(new WindowAdapter() { 

					public void windowClosing(WindowEvent e) {
						JG.dispose();

					}

				});
			//	a[4] = 0;
				JG.setVisible(true);
			} else if (b5.equals(e.getSource())
					&& !b5.getBackground().equals(Color.GREEN)) {
				
				kf.setXxzz(e.getActionCommand());
				new kf(a);
				kh.dispose();

			} else if (b6.equals(e.getSource())
					&& b6.getBackground().equals(Color.GREEN)) {
				final Frame JG = new Frame("Warning");
				Label jjg = new Label("Nobody in this Room");
				JG.setLayout(new GridLayout(2, 0));
				JG.setBounds(400, 300, 200, 100);
				jjg.setFont(new Font("", 1, 20));
				JG.add(jjg);
				JG.addWindowListener(new WindowAdapter() { 

					public void windowClosing(WindowEvent e) {
						JG.dispose();

					}

				});
		
				JG.setVisible(true);
			} else if (b6.equals(e.getSource())&& !b6.getBackground().equals(Color.GREEN)) {
			
				kf.setXxzz(e.getActionCommand());
				new kf(a);
				kh.dispose();
			}

		}

	}

}
