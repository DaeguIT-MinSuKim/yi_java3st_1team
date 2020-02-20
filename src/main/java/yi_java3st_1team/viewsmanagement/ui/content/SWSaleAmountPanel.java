package yi_java3st_1team.viewsmanagement.ui.content;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.FlowLayout;
import java.awt.Color;

@SuppressWarnings("serial")
public class SWSaleAmountPanel extends JPanel {
	private JTextField tfAmount01;
	private JTextField tfAmount02;

	/**
	 * Create the panel.
	 */
	public SWSaleAmountPanel() {

		initialize();
	}
	private void initialize() {
		FlowLayout flowLayout = (FlowLayout) getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		setBackground(SystemColor.inactiveCaption);
		setSize(new Dimension(1300, 40));
		
		JLabel lblAmount01 = new JLabel("총 판매금액");
		lblAmount01.setForeground(Color.BLACK);
		lblAmount01.setPreferredSize(new Dimension(130, 30));
		lblAmount01.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount01.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		add(lblAmount01);
		
		tfAmount01 = new JTextField();
		tfAmount01.setPreferredSize(new Dimension(200, 30));
		tfAmount01.setFont(new Font("굴림", Font.PLAIN, 16));
		tfAmount01.setColumns(15);
		add(tfAmount01);
		
		JLabel lblAmount02 = new JLabel(" 총 판매이윤");
		lblAmount02.setForeground(Color.BLACK);
		lblAmount02.setPreferredSize(new Dimension(130, 30));
		lblAmount02.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount02.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		add(lblAmount02);
		
		tfAmount02 = new JTextField();
		tfAmount02.setPreferredSize(new Dimension(200, 30));
		tfAmount02.setFont(new Font("굴림", Font.PLAIN, 16));
		tfAmount02.setColumns(15);
		add(tfAmount02);
	}

}
