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
import java.awt.Color;

@SuppressWarnings("serial")
public class SWSalePanel extends JPanel {
	private JTextField tfProduct;

	/**
	 * Create the panel.
	 */
	public SWSalePanel() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaption);
		FlowLayout flowLayout = (FlowLayout) getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		setPreferredSize(new Dimension(1300, 40));
		
		JLabel lblProduct = new JLabel("품   목   명");
		lblProduct.setForeground(Color.BLACK);
		lblProduct.setPreferredSize(new Dimension(130, 30));
		lblProduct.setHorizontalAlignment(SwingConstants.CENTER);
		lblProduct.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		add(lblProduct);
		
		tfProduct = new JTextField();
		tfProduct.setPreferredSize(new Dimension(150, 30));
		tfProduct.setFont(new Font("굴림", Font.PLAIN, 16));
		tfProduct.setColumns(15);
		add(tfProduct);
		
		JButton btnSearch = new JButton("조회");
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setBackground(new Color(70, 130, 180));
		btnSearch.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSearch.setPreferredSize(new Dimension(70, 30));
		add(btnSearch);
		
		JCheckBox cbTotal = new JCheckBox(" 전체");
		cbTotal.setPreferredSize(new Dimension(80, 30));
		cbTotal.setHorizontalAlignment(SwingConstants.CENTER);
		cbTotal.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		cbTotal.setBackground(SystemColor.inactiveCaption);
		add(cbTotal);
	}

}
