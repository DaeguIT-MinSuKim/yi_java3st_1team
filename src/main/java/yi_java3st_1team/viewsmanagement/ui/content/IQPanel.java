package yi_java3st_1team.viewsmanagement.ui.content;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.FlowLayout;
import java.awt.Color;

@SuppressWarnings("serial")
public class IQPanel extends JPanel {
	private JTextField tfProduct;

	/**
	 * Create the panel.
	 */
	public IQPanel() {

		initialize();
	}
	private void initialize() {
		FlowLayout flowLayout = (FlowLayout) getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		setBackground(SystemColor.inactiveCaption);
		setSize(new Dimension(1300, 40));
		
		JLabel lblProduct = new JLabel("품   목   명");
		lblProduct.setForeground(Color.BLACK);
		lblProduct.setPreferredSize(new Dimension(130, 30));
		lblProduct.setHorizontalAlignment(SwingConstants.CENTER);
		lblProduct.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		add(lblProduct);
		
		tfProduct = new JTextField();
		tfProduct.setPreferredSize(new Dimension(130, 30));
		tfProduct.setFont(new Font("굴림", Font.PLAIN, 16));
		tfProduct.setColumns(15);
		add(tfProduct);
		
		JButton btnSearch = new JButton("조회");
		btnSearch.setFocusable(false);
		btnSearch.setBackground(new Color(70, 130, 180));
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setPreferredSize(new Dimension(70, 30));
		btnSearch.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		add(btnSearch);
		
		JRadioButton rdbtnTotal = new JRadioButton("전체");
		rdbtnTotal.setForeground(Color.BLACK);
		rdbtnTotal.setSelected(true);
		rdbtnTotal.setPreferredSize(new Dimension(90, 30));
		rdbtnTotal.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnTotal.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		rdbtnTotal.setBackground(SystemColor.inactiveCaption);
		add(rdbtnTotal);
		
		JRadioButton rdbtn01 = new JRadioButton("재고과다");
		rdbtn01.setForeground(Color.BLUE);
		rdbtn01.setPreferredSize(new Dimension(110, 30));
		rdbtn01.setFont(new Font("굴림", Font.BOLD, 16));
		rdbtn01.setBackground(SystemColor.inactiveCaption);
		add(rdbtn01);
		
		JRadioButton rdbtn02 = new JRadioButton("적정재고");
		rdbtn02.setForeground(Color.BLACK);
		rdbtn02.setPreferredSize(new Dimension(110, 30));
		rdbtn02.setFont(new Font("굴림", Font.BOLD, 16));
		rdbtn02.setBackground(SystemColor.inactiveCaption);
		add(rdbtn02);
		
		JRadioButton rdbtn03 = new JRadioButton("재고부족");
		rdbtn03.setForeground(Color.RED);
		rdbtn03.setPreferredSize(new Dimension(110, 30));
		rdbtn03.setFont(new Font("굴림", Font.BOLD, 16));
		rdbtn03.setBackground(SystemColor.inactiveCaption);
		add(rdbtn03);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnTotal);
		group.add(rdbtn01);
		group.add(rdbtn02);
		group.add(rdbtn03);
	}

}
