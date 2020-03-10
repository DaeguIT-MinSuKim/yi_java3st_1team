package yi_java3st_1team.main.test;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;

public class JFramePieChart {
	private static PieChart pieChart;

	public static void initAndShowGUI() {
		JFrame frame = new JFrame("Swing and JavaFX");
		frame.setBounds(620, 550, 500, 470);
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
					PieChart.Data d1 = new PieChart.Data("NIO", 21);
					PieChart.Data d2 = new PieChart.Data("IO", 20);
					answer.addAll(d1, d2);
					pieChart.setData(answer);
					pieChart.getData().forEach(data ->
			           data.nameProperty().bind(
			                   Bindings.concat(data.getName(), " ", data.pieValueProperty(), " %")
			           )
					);
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
		
		pieChart = new PieChart();
		pieChart.setPrefSize(500, 500);
		pieChart.setData(getChartData());
		pieChart.setTitle("Pie Chart");
		pieChart.setLegendVisible(false);	// 범례 표시 유무
		pieChart.setLegendSide(Side.BOTTOM);// 범례 위치
		pieChart.setLabelLineLength(30);	// 원의 둘레 가장자리와 라벨간의 거리 지정
		pieChart.setClockwise(true); 		// 시계방향 배치여부
		pieChart.setLabelsVisible(true);	// 레이블 표시여부
		
		
		for(Data d : pieChart.getData()) {
			System.out.println(d.nameProperty() + "--" + d.getName());
		}
		
		
//		pieChart.getData().forEach(data -> data.nameProperty().bind(Bindings.concat(data.getName(), " ", data.pieValueProperty(), " %")));
		for(Data d : pieChart.getData()) {
			d.nameProperty().bind(Bindings.concat(d.getName(), " ", d.pieValueProperty(), " %"));
		}
		
		root.getChildren().add(pieChart);

		return scene;
	}

	private static ObservableList<Data> getChartData() {
		ObservableList<Data> answer = FXCollections.observableArrayList();
		answer.addAll(new PieChart.Data("java", 17), new PieChart.Data("JavaFx", 31), new PieChart.Data("Swing", 10));
		return answer;
	}

}
