package yi_java3st_1team.viewsmanagement.ui.test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

@SuppressWarnings("serial")
public class SpinnerTest extends JFrame {
	private String[] name = {"김철수", "김숙자", "김영희", "김자몽"};
	private JPanel panel = new JPanel();
	private JSpinner spinner;
	private JSpinner spinner_2;
	private JSpinner spinner_1;

	private JPanel contentPane;
	private testDateSalePanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpinnerTest frame = new SpinnerTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SpinnerTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1320, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		SpinnerListModel listModel = new SpinnerListModel(name);
		panel.setLayout(null);
		spinner = new JSpinner(listModel);
		spinner.setBounds(94, 5, 59, 22);
		panel.add(spinner);
		
		SpinnerNumberModel numberModel = new SpinnerNumberModel();
		spinner_1 = new JSpinner(new SpinnerNumberModel(1, 1, 6, 1));
		spinner_1.setBounds(158, 5, 34, 22);
		panel.add(spinner_1);
		
		Calendar calendar = Calendar.getInstance();
		Date value = calendar.getTime();
		
		calendar.add(Calendar.YEAR, -50);
		Date start = calendar.getTime();
		
		calendar.add(Calendar.YEAR, 100);
		Date end = calendar.getTime();
		
		SpinnerDateModel dateModel = new SpinnerDateModel(value, start, end, Calendar.YEAR);
		spinner_2 = new JSpinner(dateModel);
		spinner_2.setFont(new Font("굴림", Font.PLAIN, 30));
		spinner_2.setBounds(72, 63, 217, 56);
		spinner_2.setEditor(new JSpinner.DateEditor(spinner_2, "yyyy"));
		panel.add(spinner_2);
		
		getContentPane().add(panel);
		
		panel_1 = new testDateSalePanel();
		panel_1.setBounds(12, 164, 1237, 136);
		panel.add(panel_1);
//		setVisible(true);
	}
}
