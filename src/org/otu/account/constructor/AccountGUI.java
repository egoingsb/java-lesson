package org.otu.account.constructor;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class AccountGUI {	
	public static void main(String[] args) throws FileNotFoundException {
	        
			String data = get_data();
		
		 	JFrame fr = new JFrame("회계");
	        JPanel inputPanel = new JPanel();
	        inputPanel.setLayout(new  BoxLayout(inputPanel, BoxLayout.X_AXIS));
	        JTextField money = new JTextField(20);
	        inputPanel.add(money);
	        
	        JButton submit = new JButton("입력");
	        inputPanel.add(submit);
	        
	        JPanel outputPanel = new JPanel();
	        JTextArea result = new JTextArea(12, 25); 
	        result.setText(data);
	        JScrollPane scrollPane = new JScrollPane(result);
	        outputPanel.add(scrollPane);
	        JPanel rootPanel = new JPanel();
	        rootPanel.add(inputPanel);
	        rootPanel.add(outputPanel);
	        
	        submit.addActionListener(new ActionListener(){ //익명클래스로 리스너 작성
				public void actionPerformed(ActionEvent e){
					Person p1 = new Person(1, "Michael", 0.5);
					Person p2 = new Person(2, "Calvin", 0.3);
					Person p3 = new Person(3, "Robin", 0.2);
					Person[] profitRate = {p1, p2, p3};
					Accounting acc = new Accounting(Double.parseDouble(money.getText()), profitRate);
					String output = acc.makeOutput();
					Print.file(output);
					try {
						result.setText(get_data());
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
	        
	        fr.setContentPane(rootPanel);
	        fr.setSize(360, 300);
	        fr.setVisible(true);
	    }

	public static String get_data() throws FileNotFoundException {
		String data = "";
		for(Scanner sc = new Scanner(new File("journal.txt")); sc.hasNext(); ) {
		  String line = sc.nextLine();
		  data+=line+"\n";
		}
		return data;
	}

}
