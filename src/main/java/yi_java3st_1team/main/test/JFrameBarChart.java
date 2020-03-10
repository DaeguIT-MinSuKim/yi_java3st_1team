package yi_java3st_1team.main.test;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.paint.Color;

public class JFrameBarChart {

	private static BarChart<String, Number> barChart;

	public static void initAndShowGUI() {
		JFrame frame = new JFrame("Swing and JavaFX");
		frame.setBounds(620, 50, 500, 500);
		
		final JFXPanel fxPanel = new JFXPanel();

		frame.add(fxPanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JButton btnAdd = new JButton("추가");
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// JavaFX 데이터를 변경해야 할 때마다 코드를 Runnable 객체로 래핑 Platform.runLater하고 
				// 메소드를 호출
				Platform.runLater(() -> {
					XYChart.Series<String, Number> datas = getBarChartData(new Student("S002", "김주하", 80, 70, 60));
//					barChart.getData().set(0, datas);
					barChart.getData().add(datas);
				});
			}
		});

		frame.add(btnAdd, BorderLayout.SOUTH);

		Platform.runLater(() -> initFX(fxPanel));
	}
	
	private static void initFX(JFXPanel fxPanel) {
		Scene scene = createScene();
		fxPanel.setScene(scene);
	}

	private static Scene createScene() {
		Group root = new Group();
		Scene scene = new Scene(root, Color.ALICEBLUE);

		//막 대형 차트의 X 축과 Y 축을 정의하고 레이블을 설정
		CategoryAxis xAxis = new CategoryAxis();
		xAxis.setLabel("과목");

		NumberAxis yAxis = new NumberAxis();
		yAxis.setLabel("점수");

		barChart = new BarChart<>(xAxis, yAxis);
		barChart.setTitle("학생별 점수");
		
		barChart.setPrefSize(500, 400);
		barChart.getData().add(getBarChartData(new Student("S001", "김민수", 90, 90, 90)));
		
		root.getChildren().add(barChart);

		return scene;
	}

	public static XYChart.Series<String, Number> getBarChartData(Student std) {
		XYChart.Series<String, Number> dataSeries = new Series<String, Number>();
		dataSeries.setName(std.getStdName());
		dataSeries.getData().add(new XYChart.Data<>("국어", std.getKorScore()));
		dataSeries.getData().add(new XYChart.Data<>("영어", std.getEngScore()));
		dataSeries.getData().add(new XYChart.Data<>("수학", std.getMathScore()));
		return dataSeries;
	}
	
}
