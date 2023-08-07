package basics;
import javax.swing.*;
import java.awt.FlowLayout;

public class newClass extends JFrame {
	public static JLabel getLabel(String text, int x , int y) {
		JLabel l1 = new JLabel(text);
		return l1;
	}
	
	public static JList getList(String[] names) {
		JList list1 = new JList(names);
		return list1;
	}
	public static JComboBox getComboBox(String[] names) {
		JComboBox list1 = new JComboBox(names);
		return list1;
	}
	
	newClass(){
		setVisible(true);
		setTitle("myWindow");
		setSize(500,500);
		setDefaultCloseOperation(3);
//		add(newClass.getLabel("This is label 1", 10, 10));
		String[] names = {"chirag","Ram"};
//		add(newClass.getList(names));
		JComboBox c1 = new JComboBox(names);
		c1.setSelectedIndex(1);
//		add(newClass.getComboBox(names));
//		add(c1);
		String[] header = {"roll","name"};
		String[][] data = {
				{"1", "Chirag"},
				{"2", "Ram"}
		};
		JTable table1 = new JTable(data, header);
		JScrollPane p1 = new JScrollPane(table1);
		add(p1);
		setLayout(new FlowLayout());
		
	}
	public static void main(String args[]) {
		new newClass();
	}
}
