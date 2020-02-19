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
		setLayout(new GridLayout(0, 1, 0, 0));
		
		pTitle = new JPanel();
		pTitle.setBackground(SystemColor.inactiveCaption);
		pTitle.setBorder(new EmptyBorder(30, 0, 0, 0));
		add(pTitle);
		pTitle.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitle = new JLabel("\uACE0\uAC1D\uBCC4 \uD310\uB9E4\uD604\uD669 \uC870\uD68C");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("����", Font.BOLD, 30));
		pTitle.add(lblTitle, BorderLayout.NORTH);
		
		JPanel pTop = new JPanel();
		pTop.setBackground(SystemColor.inactiveCaption);
		pTop.setBorder(new EmptyBorder(40, 100, 50, 100));
		pTitle.add(pTop, BorderLayout.CENTER);
		pTop.setLayout(new BorderLayout(0, 0));
		
		JPanel pSearch = new JPanel();
		pSearch.setPreferredSize(new Dimension(1300, 40));
		pSearch.setBackground(SystemColor.inactiveCaption);
		pTop.add(pSearch, BorderLayout.NORTH);
		pSearch.setLayout(new GridLayout(0, 1, 0, 0));
		
		ClientSalePanel pClientSale = new ClientSalePanel();
		pSearch.add(pClientSale);
		
		JPanel pList = new JPanel();
		pList.setBackground(SystemColor.inactiveCaptionBorder);
		pTop.add(pList, BorderLayout.CENTER);
		pList.setLayout(new GridLayout(1, 0, 0, 0));
		
		ClientSaleTblPanel pClientList = new ClientSaleTblPanel();
		pClientList.setBackground(SystemColor.inactiveCaptionBorder);
		pList.add(pClientList);
		
		JPanel pAmount = new JPanel();
		pAmount.setBackground(SystemColor.inactiveCaption);
		pTop.add(pAmount, BorderLayout.SOUTH);
		pAmount.setLayout(new GridLayout(0, 1, 0, 0));
		
		TotalAmountPanel pTotalAmount = new TotalAmountPanel();
		pAmount.add(pTotalAmount);
	}

}
