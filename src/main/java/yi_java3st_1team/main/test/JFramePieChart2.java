package yi_java3st_1team.main.test;

import java.awt.BorderLayout;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JFrame;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.text.Text;

public class JFramePieChart2 {
	private static PieChart pieChart;

	public static void initAndShowGUI() {
		JFrame frame = new JFrame("Swing and JavaFX");
		frame.setBounds(1120, 50, 600,600);

		final JFXPanel fxPanel = new JFXPanel();

		frame.add(fxPanel, BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JButton btnAdd = new JButton("추가");
		btnAdd.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// JavaFX 데이터를 변경해야 할 때마다 코드를 Runnable 객체( Platform.runLater)로 래핑하고 메소드를 호출
				Platform.runLater(() -> {
					ObservableList<Data> answer = getChartData();
					answer.addAll(new PieChart.Data("java nio", 21),new PieChart.Data("java io", 20));
					
					pieChart.getData().clear();
					pieChart.setData(answer);
				});
			}
		});

		frame.add(btnAdd, BorderLayout.NORTH);

		Platform.runLater(() -> initFX(fxPanel));
	}

	private static void initFX(JFXPanel fxPanel) {
		Scene scene = createScene();
		fxPanel.setScene(scene);
	}

	private static Scene createScene() {
		Group root = new Group();
		Scene scene = new Scene(root);
		root.setAutoSizeChildren(true);
		
		pieChart = new PieChart() {
			@Override
			protected void layoutChartChildren(double top, double left, double contentWidth, double contentHeight) {
				super.layoutChartChildren(top, left, contentWidth, contentHeight);
				if (getLabelsVisible()) {
					getData().forEach(d -> {
						Optional<Node> opTextNode = pieChart.lookupAll(".chart-pie-label").stream()
								.filter(n -> n instanceof Text && ((Text) n).getText().contains(d.getName())).findAny();
						if (opTextNode.isPresent()) {
							((Text) opTextNode.get()).setText(d.getName() + " " + d.getPieValue() + " %");
						}
					});
				}
				
			}
		};
		
		pieChart.setPrefSize(550, 500);
		pieChart.setData(getChartData());
		pieChart.setTitle("Pie Chart");
		pieChart.setLegendSide(Side.BOTTOM);// 범례 위치
		pieChart.setLabelLineLength(30);// 원의 둘레 가장자리와 라벨간의 거리 지정
		pieChart.setClockwise(true); // 시계방향 배치여부
		pieChart.setLabelsVisible(true);// 레이블 표시여부

		root.getChildren().add(pieChart);

		return scene;
	}

	private static ObservableList<Data> getChartData() {
		ObservableList<Data> answer = FXCollections.observableArrayList();
		answer.addAll(new PieChart.Data("java", 17), new PieChart.Data("JavaFx", 31), new PieChart.Data("Swing", 10));
		return answer;
	}

}
