package org.otu.account.constructor;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
// https://kamang-it.tistory.com/entry/Swing-04Layout%EB%B0%B0%EC%B9%98%EA%B4%80%EB%A6%AC%EC%9E%90
public class AccountGUI {

	
	public static void main(String[] args) {
	        
			
		 	JFrame fr = new JFrame("This 프레임");
	        JPanel pn = new JPanel();
	        
	        JTextField money = new JTextField(20);
	        pn.add(money);
	        
	        JTextArea ta = new JTextArea(7, 20); 
	        pn.add(ta);
	        
	        JButton submit = new JButton("입력");
	        submit.addActionListener(new ActionListener(){ //익명클래스로 리스너 작성
				public void actionPerformed(ActionEvent e){
					Person p1 = new Person(1, "Michael", 0.5);
					Person p2 = new Person(2, "Calvin", 0.3);
					Person p3 = new Person(3, "Robin", 0.2);
					Person[] profitRate = {p1, p2, p3};
					Accounting acc = new Accounting(Double.parseDouble(money.getText()), profitRate);
					String output = acc.makeOutput();
					Print.file(output);
					ta.setText(output);
				}
			});
	        pn.add(submit);
	        
	        fr.setContentPane(pn);
	        fr.setSize(400, 300);
	        fr.setVisible(true);
	    }

}
