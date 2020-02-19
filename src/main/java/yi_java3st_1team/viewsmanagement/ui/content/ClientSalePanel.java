package yi_java3st_1team.viewsmanagement.ui.content;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class ClientSalePanel extends JPanel {
	private JTextField tfCName;

	public ClientSalePanel() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaption);
		setSize(new Dimension(1300, 40));
		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblCName = new JLabel("고 객 상 호 명 ");
		lblCName.setPreferredSize(new Dimension(150, 30));
		lblCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCName.setFont(new Font("Dialog", Font.BOLD, 18));
		add(lblCName);
		
		tfCName = new JTextField();
		tfCName.setPreferredSize(new Dimension(130, 30));
		tfCName.setFont(new Font("굴림", Font.PLAIN, 16));
		tfCName.setColumns(15);
		add(tfCName);
		
		JButton btnSearch = new JButton("조회");
		btnSearch.setPreferredSize(new Dimension(60, 30));
		add(btnSearch);
		
		JCheckBox cbTotal = new JCheckBox(" 전체");
		cbTotal.setPreferredSize(new Dimension(80, 30));
		cbTotal.setHorizontalAlignment(SwingConstants.CENTER);
		cbTotal.setFont(new Font("굴림", Font.PLAIN, 16));
		cbTotal.setBackground(SystemColor.inactiveCaption);
		add(cbTotal);
	}

}