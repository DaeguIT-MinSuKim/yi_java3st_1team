package yi_java3st_1team.viewsmanagement.ui.content;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class TotalAmountPanel extends JPanel {
	private JTextField tfAmount01;
	private JTextField tfAmount02;

	/**
	 * Create the panel.
	 */
	public TotalAmountPanel() {

		initialize();
	}
	private void initialize() {
		FlowLayout flowLayout = (FlowLayout) getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		setBackground(SystemColor.inactiveCaption);
		setSize(new Dimension(1300, 40));
		
		JLabel lblAmount01 = new JLabel("총 매출금");
		lblAmount01.setPreferredSize(new Dimension(130, 30));
		lblAmount01.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount01.setFont(new Font("Dialog", Font.BOLD, 18));
		add(lblAmount01);
		
		tfAmount01 = new JTextField();
		tfAmount01.setPreferredSize(new Dimension(200, 30));
		tfAmount01.setFont(new Font("굴림", Font.PLAIN, 16));
		tfAmount01.setColumns(15);
		add(tfAmount01);
		
		JLabel lblAmount02 = new JLabel(" 총 미수금 ");
		lblAmount02.setPreferredSize(new Dimension(130, 30));
		lblAmount02.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount02.setFont(new Font("Dialog", Font.BOLD, 18));
		add(lblAmount02);
		
		tfAmount02 = new JTextField();
		tfAmount02.setPreferredSize(new Dimension(200, 30));
		tfAmount02.setFont(new Font("굴림", Font.PLAIN, 16));
		tfAmount02.setColumns(15);
		add(tfAmount02);
	}

}
