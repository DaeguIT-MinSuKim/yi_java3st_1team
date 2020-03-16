package yi_java3st_1team.main.login;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class AbsRegiPanel<T> extends JPanel {

//	public abstract Object[] toArray(T item);
	
	public abstract T getItem();
	
//	public abstract void setItem(T item);
	
	public abstract void clearTf();
}
