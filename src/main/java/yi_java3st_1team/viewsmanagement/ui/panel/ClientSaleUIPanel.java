package yi_java3st_1team.viewsmanagement.ui.panel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import yi_java3st_1team.viewsmanagement.ui.content.ClientSalePanel;
import yi_java3st_1team.viewsmanagement.ui.content.TotalAmountPanel;
import yi_java3st_1team.viewsmanagement.ui.list.ClientSaleTblPanel;
import java.awt.Color;

@SuppressWarnings("serial")
public class ClientSaleUIPanel extends JPanel {
	private JPanel pTitle;

	/**
	 * Create the panel.
	 */
	public ClientSaleUIPanel() {

		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(1500, 900));
		setLayout(null);
		
		pTitle = new JPanel();
		pTitle.setBounds(0, 0, 1500, 900);
		pTitle.setBackground(SystemColor.inactiveCaption);
		pTitle.setBorder(new EmptyBorder(30, 0, 0, 0));
		add(pTitle);
		pTitle.setLayout(null);
		
		JLabel lblTitle = new JLabel("\uACE0\uAC1D\uBCC4 \uD310\uB9E4\uD604\uD669 \uC870\uD68C");
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setBounds(0, 30, 1500, 42);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 32));
		pTitle.add(lblTitle);
		
		JPanel pTop = new JPanel();
		pTop.setBounds(0, 72, 1500, 828);
		pTop.setBackground(SystemColor.inactiveCaption);
		pTop.setBorder(new EmptyBorder(40, 100, 50, 100));
		pTitle.add(pTop);
		pTop.setLayout(null);
		
		JPanel pSearch = new JPanel();
		pSearch.setBounds(100, 40, 1300, 40);
		pSearch.setPreferredSize(new Dimension(1300, 40));
		pSearch.setBackground(SystemColor.inactiveCaption);
		pTop.add(pSearch);
		pSearch.setLayout(null);
		
		ClientSalePanel pClientSale = new ClientSalePanel();
		pClientSale.setBounds(0, 0, 1300, 40);
		pSearch.add(pClientSale);
		
		JPanel pList = new JPanel();
		pList.setBounds(100, 80, 1300, 658);
		pList.setBackground(SystemColor.inactiveCaptionBorder);
		pTop.add(pList);
		pList.setLayout(null);
		
		ClientSaleTblPanel pClientList = new ClientSaleTblPanel();
		pClientList.setBounds(0, 0, 1300, 658);
		pClientList.setBackground(SystemColor.inactiveCaptionBorder);
		pList.add(pClientList);
		
		JPanel pAmount = new JPanel();
		pAmount.setBounds(100, 738, 1300, 40);
		pAmount.setBackground(SystemColor.inactiveCaption);
		pTop.add(pAmount);
		pAmount.setLayout(null);
		
		TotalAmountPanel pTotalAmount = new TotalAmountPanel();
		pTotalAmount.setBounds(0, 0, 1300, 40);
		pAmount.add(pTotalAmount);
	}

}
