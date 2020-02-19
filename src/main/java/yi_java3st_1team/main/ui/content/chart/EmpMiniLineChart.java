package yi_java3st_1team.main.ui.content.chart;

import java.awt.Dimension;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;

@SuppressWarnings("serial")
public class EmpMiniLineChart extends JFXPanel implements InitScene{

	/**
	 * Create the panel.
	 */
	public EmpMiniLineChart() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setPreferredSize(new Dimension(1134, 348));
		setLayout(null);
	}
	@Override
	public Scene createScene() {
		// TODO Auto-generated method stub
		return null;
	}
}
