import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;


public class CalcEngine implements ActionListener{
	private Calc parent;
	public CalcEngine(Calc parent) {
		this.parent = parent;
	}
	
	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(parent.getTf1());
		int b = Integer.parseInt(parent.getTf2());
		int c = a+b;
		parent.setTf_result(c);
	}

}
