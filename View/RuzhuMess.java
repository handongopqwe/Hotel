package roomMannger;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import dao.RuzhuDao;
import entity.RuzhuCourse;
public class RuzhuMess {
	public static void main(String[] args) {
		new Vistener();
	}
}

class Vistener implements ActionListener {
	//
	String xm, sfid1, Ruzhutime, Ruzhufj;
	int yj;
	TextField b1, b2, b3, b4, b5;
	Frame Ru;
	Button a1, a2;
	public void tt() {
		Ru = new Frame("入住信息登记");
		Ru.setLayout(new GridLayout(0, 2, 5, 5));
		Ru.setBounds(300, 200, 400, 400);
		a1 = new Button("提交");
		a2 = new Button("返回");
		b1 = new TextField(5);
		b2 = new TextField(5);
		b3 = new TextField(5);
		b4 = new TextField(5);
		b5 = new TextField(5);
		Label c1 = new Label("姓名");
		Label c2 = new Label("身份证号");
		Label c3 = new Label("入住时间");
		Label c4 = new Label("入住房间");
		Label c5 = new Label("押金");
		Ru.add(c1);
		Ru.add(b1);
		Ru.add(c2);
		Ru.add(b2);
		Ru.add(c3);
		Ru.add(b3);
		Ru.add(c4);
		Ru.add(b4);
		Ru.add(c5);
		Ru.add(b5);
		Ru.add(a1);
		a1.addActionListener(this);
		a2.addActionListener(this);
		Ru.add(a2);
		Ru.setVisible(true);
		Ru.addWindowListener(new WindowAdapter() { // 关闭窗口
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public Vistener() {
		tt();
	}

	public void actionPerformed(ActionEvent arg0) {

		if (a2.equals(arg0.getSource())) {
			Text.main(null);
			Ru.dispose();
		} else {
			xm = b1.getText();
			sfid1 = b2.getText();
			Ruzhutime = b3.getText();
			Ruzhufj = b4.getText();
			yj = Integer.parseInt((b5.getText().toString()));
			RuzhuCourse c = new RuzhuCourse();
			c.setXm(xm);
			c.setSfid1(sfid1);
			c.setRuzhutime(Ruzhutime);
			c.setRuzhufj(Ruzhufj);
			c.setYj(yj);
			RuzhuDao tb = new RuzhuDao();
			tb.pddCourse(c);
			
			Text.main(null);
			Ru.dispose();
		}
	}
}
