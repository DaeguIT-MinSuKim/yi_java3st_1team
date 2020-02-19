package yi_java3st_1team.viewsmanagement.ui.panel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import yi_java3st_1team.viewsmanagement.ui.content.ClientPanel;
import yi_java3st_1team.viewsmanagement.ui.content.EmployeePanel;
import java.awt.BorderLayout;
import yi_java3st_1team.viewsmanagement.ui.graph.EmployeeGraphPanel;

@SuppressWarnings("serial")
public class GraphUIPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public GraphUIPanel() {

		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(1500, 900));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pLeft = new JPanel();
		pLeft.setBackground(SystemColor.inactiveCaption);
		add(pLeft);
		pLeft.setLayout(new BoxLayout(pLeft, BoxLayout.Y_AXIS));
		
		JPanel pLTitle = new JPanel();
		pLTitle.setBorder(new EmptyBorder(50, 0, 0, 0));
		pLTitle.setBackground(SystemColor.inactiveCaption);
		pLTitle.setPreferredSize(new Dimension(750, 50));
		pLeft.add(pLTitle);
		
		JLabel lblLTitle = new JLabel("고객사 주문현황 그래프");
		lblLTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblLTitle.setFont(new Font("굴림", Font.BOLD, 30));
		pLTitle.add(lblLTitle);
		
		JPanel pLSearch = new JPanel();
		pLSearch.setBorder(new EmptyBorder(30, 0, 0, 0));
		pLSearch.setBackground(SystemColor.inactiveCaption);
		pLSearch.setPreferredSize(new Dimension(750, 15));
		pLeft.add(pLSearch);
		pLSearch.setLayout(new GridLayout(0, 1, 0, 0));
		
		ClientPanel pClient = new ClientPanel();
		pLSearch.add(pClient);
		
		JPanel pLChart = new JPanel();
		pLChart.setBorder(new EmptyBorder(5, 45, 55, 35));
		pLChart.setBackground(SystemColor.inactiveCaption);
		pLChart.setPreferredSize(new Dimension(750, 650));
		pLeft.add(pLChart);
		pLChart.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pLLChart = new JPanel();
		pLLChart.setBackground(SystemColor.inactiveCaptionBorder);
		pLChart.add(pLLChart);
		pLLChart.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pClientGraph = new JPanel();
		pClientGraph.setBackground(SystemColor.inactiveCaptionBorder);
		pLLChart.add(pClientGraph);
		
		JPanel pRight = new JPanel();
		pRight.setBackground(SystemColor.inactiveCaption);
		add(pRight);
		pRight.setLayout(new BoxLayout(pRight, BoxLayout.Y_AXIS));
		
		JPanel pRTitle = new JPanel();
		pRTitle.setBorder(new EmptyBorder(50, 0, 0, 0));
		pRTitle.setBackground(SystemColor.inactiveCaption);
		pRTitle.setPreferredSize(new Dimension(750, 50));
		pRight.add(pRTitle);
		
		JLabel lblNewLabel = new JLabel("영업사원 실적현황 그래프");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		pRTitle.add(lblNewLabel);
		
		JPanel pRSearch = new JPanel();
		pRSearch.setBorder(new EmptyBorder(30, 0, 0, 0));
		pRSearch.setBackground(SystemColor.inactiveCaption);
		pRSearch.setPreferredSize(new Dimension(750, 15));
		pRight.add(pRSearch);
		pRSearch.setLayout(new GridLayout(0, 1, 0, 0));
		
		EmployeePanel pEmp = new EmployeePanel();
		pRSearch.add(pEmp);
		
		JPanel pRChart = new JPanel();
		pRChart.setBorder(new EmptyBorder(5, 45, 55, 35));
		pRChart.setBackground(SystemColor.inactiveCaption);
		pRChart.setPreferredSize(new Dimension(750, 650));
		pRight.add(pRChart);
		pRChart.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pRRChart = new JPanel();
		pRRChart.setBackground(SystemColor.inactiveCaptionBorder);
		pRChart.add(pRRChart);
		pRRChart.setLayout(new GridLayout(0, 1, 0, 0));
		
		EmployeeGraphPanel pEmpGraph = new EmployeeGraphPanel();
		pEmpGraph.setBackground(SystemColor.inactiveCaptionBorder);
		pRRChart.add(pEmpGraph);
	}

}
