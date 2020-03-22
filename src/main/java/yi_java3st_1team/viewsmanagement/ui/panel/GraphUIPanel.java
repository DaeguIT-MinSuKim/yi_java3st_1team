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

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import yi_java3st_1team.viewsmanagement.ui.chart.EmployeeChartPanel;
import yi_java3st_1team.viewsmanagement.ui.chart.InitScene;
import yi_java3st_1team.viewsmanagement.ui.content.ClientPanel;
import yi_java3st_1team.viewsmanagement.ui.content.EmployeePanel;
import java.awt.BorderLayout;
import java.awt.Color;
import yi_java3st_1team.viewsmanagement.ui.chart.ClientChartPanel;

@SuppressWarnings("serial")
public class GraphUIPanel extends JPanel {

	private ClientChartPanel pClientGraph;
	/**
	 * Create the panel.
	 */
	public GraphUIPanel() {

		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(1500, 900));
		setLayout(null);
		
		JPanel pLeft = new JPanel();
		pLeft.setBounds(0, 0, 750, 900);
		pLeft.setBackground(SystemColor.inactiveCaption);
		add(pLeft);
		pLeft.setLayout(null);
		
		JPanel pLTitle = new JPanel();
		pLTitle.setBounds(0, 0, 750, 112);
		pLTitle.setBorder(new EmptyBorder(50, 0, 0, 0));
		pLTitle.setBackground(SystemColor.inactiveCaption);
		pLTitle.setPreferredSize(new Dimension(750, 50));
		pLeft.add(pLTitle);
		pLTitle.setLayout(null);
		
		JLabel lblLTitle = new JLabel("고객사 주문현황 그래프");
		lblLTitle.setForeground(Color.BLACK);
		lblLTitle.setBounds(12, 55, 726, 35);
		lblLTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblLTitle.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 32));
		pLTitle.add(lblLTitle);
		
		JPanel pLSearch = new JPanel();
		pLSearch.setBounds(0, 112, 750, 77);
		pLSearch.setBorder(new EmptyBorder(30, 0, 0, 0));
		pLSearch.setBackground(SystemColor.inactiveCaption);
		pLSearch.setPreferredSize(new Dimension(750, 15));
		pLeft.add(pLSearch);
		pLSearch.setLayout(null);
		
		ClientPanel pClient = new ClientPanel();
		pClient.setBounds(0, 30, 750, 47);
		pLSearch.add(pClient);
		
		JPanel pLChart = new JPanel();
		pLChart.setBounds(0, 189, 750, 710);
		pLChart.setBorder(new EmptyBorder(5, 45, 55, 35));
		pLChart.setBackground(SystemColor.inactiveCaption);
		pLChart.setPreferredSize(new Dimension(750, 650));
		pLeft.add(pLChart);
		pLChart.setLayout(null);
		
		JPanel pLLChart = new JPanel();
		pLLChart.setBounds(45, 5, 670, 650);
		pLLChart.setBackground(SystemColor.inactiveCaptionBorder);
		pLChart.add(pLLChart);
		pLLChart.setLayout(new GridLayout(0, 1, 0, 0));
		
		pClientGraph = new ClientChartPanel();
		pClientGraph.setBackground(SystemColor.inactiveCaptionBorder);
		pLLChart.add(pClientGraph);
		
		Platform.runLater(() -> initFX(pClientGraph));
		
		JPanel pRight = new JPanel();
		pRight.setBounds(750, 0, 750, 900);
		pRight.setBackground(SystemColor.inactiveCaption);
		add(pRight);
		pRight.setLayout(null);
		
		JPanel pRTitle = new JPanel();
		pRTitle.setBounds(0, 0, 750, 112);
		pRTitle.setBorder(new EmptyBorder(50, 0, 0, 0));
		pRTitle.setBackground(SystemColor.inactiveCaption);
		pRTitle.setPreferredSize(new Dimension(750, 50));
		pRight.add(pRTitle);
		pRTitle.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("영업사원 실적현황 그래프");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(12, 55, 726, 35);
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 30));
		pRTitle.add(lblNewLabel);
		
		JPanel pRSearch = new JPanel();
		pRSearch.setBounds(0, 112, 750, 77);
		pRSearch.setBorder(new EmptyBorder(30, 0, 0, 0));
		pRSearch.setBackground(SystemColor.inactiveCaption);
		pRSearch.setPreferredSize(new Dimension(750, 15));
		pRight.add(pRSearch);
		pRSearch.setLayout(null);
		
		EmployeePanel pEmp = new EmployeePanel();
		pEmp.setBounds(0, 30, 750, 47);
		pRSearch.add(pEmp);
		
		JPanel pRChart = new JPanel();
		pRChart.setBounds(0, 189, 750, 710);
		pRChart.setBorder(new EmptyBorder(5, 45, 55, 35));
		pRChart.setBackground(SystemColor.inactiveCaption);
		pRChart.setPreferredSize(new Dimension(750, 650));
		pRight.add(pRChart);
		pRChart.setLayout(null);
		
		JPanel pRRChart = new JPanel();
		pRRChart.setBounds(45, 5, 670, 650);
		pRRChart.setBackground(SystemColor.inactiveCaptionBorder);
		pRChart.add(pRRChart);
		pRRChart.setLayout(new GridLayout(0, 1, 0, 0));
		
		EmployeeChartPanel pEmpGraph = new EmployeeChartPanel();
		pEmpGraph.setBackground(SystemColor.inactiveCaptionBorder);
		pRRChart.add(pEmpGraph);
		
		Platform.runLater(() -> initFX(pEmpGraph));
	}
	
	public void initFX(InitScene fxPanel) {
		Scene scene = fxPanel.createScene();
		JFXPanel panel = (JFXPanel) fxPanel;
		panel.setScene(scene);
	}

	
}
