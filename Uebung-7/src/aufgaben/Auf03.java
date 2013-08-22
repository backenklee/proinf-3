package aufgaben;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Auf03 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 78724855710579535L;

	private double alt = 0;
	private char operator = ' ';

	private JTextField textf = new JTextField();
	private JLabel label = new JLabel();
	private JButton addb = new JButton("+"), subb = new JButton("-"),
			mulb = new JButton("*"), divb = new JButton("/");

	public Auf03() {
		super("Miau");

		setSize(800, 600);

		Container mäh, muh, cp = getContentPane();
		cp.setLayout(new GridLayout(3, 1));
		cp.add(textf);
		cp.add(label);
		mäh = new Container();
		muh = new Container();
		cp.add(mäh);
		mäh.setLayout(new FlowLayout());

		mäh.add(muh);
		muh.setLayout(new GridLayout(4, 3));

		mäh.add(addb);
		mäh.add(subb);
		mäh.add(mulb);
		mäh.add(divb);
		JButton blubb;
		for (int zhlr = 1; zhlr < 10; zhlr++) {
			blubb = new JButton("" + zhlr);
			muh.add(blubb);
			blubb.addActionListener(this);
		}
		blubb = new JButton("0");
		muh.add(blubb);
		blubb.addActionListener(this);

		textf.addActionListener(this);
		addb.addActionListener(this);
		subb.addActionListener(this);
		mulb.addActionListener(this);
		divb.addActionListener(this);

		setVisible(true);
	}

	public static void main(String args[]) {
		Auf03 bla = new Auf03();
	}

	private void calc() {
		// get Textnum
		double neu = 0;
		try {
			neu = Double.parseDouble(textf.getText());
		} catch (Exception E) {
			neu = alt;
		}
		;
		if (operator == ' ') {
			alt = neu;
		} else if (operator == '+') {
			alt += neu;
		} else if (operator == '-') {
			alt -= neu;
		} else if (operator == '*') {
			alt *= neu;
		} else if (operator == '/') {
			alt /= neu;
		}
		textf.setText("");
		label.setText("" + alt);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == textf) {

			calc();
			operator = ' ';
		} else if (e.getSource() == addb) {
			calc();
			operator = '+';
		} else if (e.getSource() == subb) {
			calc();
			operator = '-';
		} else if (e.getSource() == mulb) {
			calc();
			operator = '*';
		} else if (e.getSource() == divb) {
			calc();
			operator = '/';
		} else if (e.getSource() instanceof JButton) {
			textf.setText(textf.getText() + ((JButton) e.getSource()).getText());
		}

	}
}
