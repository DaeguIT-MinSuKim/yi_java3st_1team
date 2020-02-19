package yi_java3st_1team.main.ui.content.chart;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;

@SuppressWarnings("serial")
public class ClientMiniPieChart extends JFXPanel implements InitScene{

	/**
	 * Create the panel.
	 */
	public ClientMiniPieChart() {

		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(350, 250));
		setLayout(new BorderLayout(0, 0));
	}
	@Override
	public Scene createScene() {
		// TODO Auto-generated method stub
		return null;
	}

}
