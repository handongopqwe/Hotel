package roomMannger;
import java.awt.*;
import java.awt.event.*;
import dao.TfDao;
import entity.RmesCourse;
class Tf implements ActionListener {
	Frame o;
	Choice a;
	Button b1, b2;
	Panel x;
	public void ll() {
		o = new Frame("退房");
		a = new Choice();
		x = new Panel();
		b1 = new Button("确定");
		b2 = new Button("返回");
		o.setLayout(new GridLayout(2, 1));
		x.setLayout(new GridLayout(1, 2));
		o.setBounds(300, 300, 200, 200);
		a.setFont(new Font("", 1, 10));
		a.setSize(50, 50);
		a.addItem("301");
		a.addItem("302");
		a.addItem("303");
		a.addItem("304");
		a.addItem("305");
		a.addItem("306");
		o.add(a);
		x.add(b1);
		x.add(b2);
		o.add(x);
		b1.addActionListener(this);
		b2.addActionListener(this);
		o.setVisible(true);
		o.addWindowListener(new WindowAdapter() { // 关闭窗口
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public Tf() {
		ll();
	}
	public void actionPerformed(ActionEvent e) {
		String m = a.getSelectedItem();
		if (b1.equals(e.getSource())) {
			RmesCourse t = new RmesCourse();
			t.setSc(m);
			TfDao l = new TfDao();
			l.pddCourse(t);
			Text.main(null);
			o.dispose();
		} else {
			Text.main(null);
			o.dispose();
		}
	}

}
