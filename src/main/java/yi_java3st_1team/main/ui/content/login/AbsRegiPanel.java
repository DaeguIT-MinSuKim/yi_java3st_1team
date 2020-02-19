package yi_java3st_1team.main.ui.content.login;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class AbsRegiPanel<T> extends JPanel {

	public abstract T getItem();
	
	public abstract void clearTf();

}
