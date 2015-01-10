import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;

import javax.swing.*;
public class Calc{
	JPanel panel;
	JLabel label1;
	private JTextField tf1;
	JLabel label2;
	private JTextField tf2;
	JLabel label3;
	private JTextField tf_result;
	JButton btn_go;
	
	public Calc(){
		
		//Calc calc = new Calc();
		panel = new JPanel();
		label1 = new JLabel("Number 1:");
		tf1 = new JTextField(10);
		label2 = new JLabel("Number 2:");
		tf2 = new JTextField(10);
		label3 = new JLabel("Sum:");
		tf_result = new JTextField(10);
		btn_go = new JButton("Add");
		
		//FlowLayout fl = new FlowLayout();
		//GridLayout gl = new GridLayout(4,2);
		/*GridBagLayout gbl = new GridBagLayout();*/
		panel.setLayout(null);
		
	/*	GridBagConstraints cbc = new GridBagConstraints();
		cbc.gridx = 0;
		cbc.gridy = 0;
		
		cbc.gridheight = 1;
		cbc.gridwidth = 6;
		
		cbc.fill = cbc.BOTH;
		
		cbc.weightx = 1.0;
		cbc.weighty = 1.0;
		
		cbc.anchor = cbc.CENTER;*/
		
		/*gbl.setConstraints(tf1, cbc);
		panel.add(tf1);*/
		
		panel.add(label1);
		panel.add(tf1);
		panel.add(label2);
		panel.add(tf2);
		panel.add(label3);
		panel.add(tf_result);
		panel.add(btn_go);
		
		
		label1.setBounds(10,10,100,25);
		label2.setBounds(200,10,100,25);
		label3.setBounds(150,10,100,25);
		
		tf1.setBounds(80,10,100,25);
		tf2.setBounds(270,10,100,25);
		tf_result.setBounds(150,50,100,25);
		btn_go.setBounds(250,50,80,25);
		
		CalcEngine calcEngine = new CalcEngine(this);
		btn_go.addActionListener(calcEngine);
		
		JFrame frame = new JFrame("My first calculator");
		frame.setContentPane(panel);
		frame.setSize(550, 120);
		frame.setVisible(true);
		//frame.setResizable(false);
		MyWindowEventProcessor mw = new MyWindowEventProcessor();
		frame.addWindowListener(mw);
		
	}
	
	
	
	public static void main(String []args){	
		new Calc();
	}

	public String getTf1() {
		return tf1.getText();
	}

	public void setTf_result(int value) {
		this.tf_result.setText(value+"");
	}

	public String getTf2() {
		return tf2.getText();
	}
	
	

}


