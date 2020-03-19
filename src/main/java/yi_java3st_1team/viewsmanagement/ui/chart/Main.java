package yi_java3st_1team.viewsmanagement.ui.chart;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import chart_project.chart_frame.JFrameBarChart;
import chart_project.chart_frame.JFrameLineChart;
import chart_project.chart_frame.JFramePieChart;
import chart_project.chart_frame.JFramePieChart2;
import chart_project.chart_panel.InitScene;
import chart_project.chart_panel.PanelBarChart;
import chart_project.chart_panel.PanelLineChart;
import chart_project.chart_panel.PanelPieChart;
import chart_project.dto.Student;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;

@SuppressWarnings("serial")
public class Main extends JFrame implements ActionListener {

	private JPanel contentPane;
	private PanelBarChart pBarChart;
	private JButton btnDel;
	private JButton btnUpdate;
	private JButton btnAllClear;
	private JButton btnClearAfterAdd;
	private PanelPieChart pPieChart;
	private PanelLineChart pLineChart;
	private JButton btnLineAdd;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					
					JFrameBarChart.initAndShowGUI();
					JFramePieChart.initAndShowGUI();
					JFramePieChart2.initAndShowGUI();
					JFrameLineChart.initAndShowGUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initComponents();
	}
	
	private void initComponents() {
		setTitle("Chart 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 520, 980);  // (250+30) * 3 + 40
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		pBarChart = new PanelBarChart();
		contentPane.add(pBarChart);
		
		pPieChart = new PanelPieChart();
		contentPane.add(pPieChart);
		
		pLineChart = new PanelLineChart();
		contentPane.add(pLineChart);
		
		Platform.runLater(() -> initFX(pBarChart));
		Platform.runLater(() -> initFX(pPieChart));
		Platform.runLater(() -> initFX(pLineChart));
		
		JPanel pBtn = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.add(pBtn);
		
		JButton btnAdd = new JButton("추가");
		btnAdd.addActionListener(new BtnAddActionListener());
		pBtn.add(btnAdd);
		
		btnDel = new JButton("삭제");
		btnDel.addActionListener(this);
		pBtn.add(btnDel);
		
		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(this);
		pBtn.add(btnUpdate);
		
		btnAllClear = new JButton("전체삭제");
		btnAllClear.addActionListener(this);
		pBtn.add(btnAllClear);
		
		btnClearAfterAdd = new JButton("삭제후추가");
		btnClearAfterAdd.addActionListener(this);
		pBtn.add(btnClearAfterAdd);
		
		btnLineAdd = new JButton("라인항목추가");
		btnLineAdd.addActionListener(this);
		pBtn.add(btnLineAdd);
	}
	
	public void initFX(InitScene fxPanel) {
		Scene scene = fxPanel.createScene();
		JFXPanel panel = (JFXPanel) fxPanel;
		panel.setScene(scene);
	}


	private class BtnAddActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Platform.runLater(() -> {
				pBarChart.addChartData(new Student("S003", "이유영", 80, 70, 60));
				pPieChart.addChartData("Python", 10);
				pLineChart.addChartData(new Student("S003", "이유영", 80, 70, 60));
			});
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLineAdd) {
			do_btnLineAdd_actionPerformed(e);
		}
		if (e.getSource() == btnClearAfterAdd) {
			do_btnClearAfterAdd_actionPerformed(e);
		}
		if (e.getSource() == btnAllClear) {
			do_btnAllClear_actionPerformed(e);
		}
		if (e.getSource() == btnUpdate) {
			do_btnUpdate_actionPerformed(e);
		}
		if (e.getSource() == btnDel) {
			do_btnDel_actionPerformed(e);
		}
	}
	
	protected void do_btnDel_actionPerformed(ActionEvent e) {
		Platform.runLater(() -> {
			pBarChart.delChartData(new Student("S003", "이유영", 80, 70, 60));
			pPieChart.delChartData("Python");
			pLineChart.delChartData(new Student("S003", "이유영", 80, 70, 60));
		});
	}
	
	protected void do_btnUpdate_actionPerformed(ActionEvent e) {
		Platform.runLater(() -> {
			pBarChart.updateChartData(new Student("S003", "이유영", 10, 15, 5));
			pLineChart.updateChartData(new Student("S003", "이유영", 10, 15, 5));
			pPieChart.updateChartData("Python", 40);
		});
	}
	
	protected void do_btnAllClear_actionPerformed(ActionEvent e) {
		Platform.runLater(() -> {
			pBarChart.deleteAllData();
			pPieChart.deleteAllData();
			pLineChart.deleteAllData();
		});
	}
	
	protected void do_btnClearAfterAdd_actionPerformed(ActionEvent e) {
		Platform.runLater(() -> {
			pBarChart.deleteAllData();
			pBarChart.addAllChartData();
			
			pPieChart.deleteAllData();
			pPieChart.addAllChartData();
			
			pLineChart.deleteAllData();
			pLineChart.addAllChartData();
		});
	}
	
	protected void do_btnLineAdd_actionPerformed(ActionEvent e) {
		Platform.runLater(() -> {
			pLineChart.addSeries("포트폴리오" , 99, 77);
		});
	}
}
