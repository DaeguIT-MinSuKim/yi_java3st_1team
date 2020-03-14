package yi_java3st_1team.viewsmanagement.ui.list;

import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.ui.list.AbstractTblPanel;
import yi_java3st_1team.viewsmanagement.dto.IQEvaluation;

@SuppressWarnings("serial")
public class IQEvaluationTblPanel extends AbstractTblPanel<IQEvaluation> {
	public IQEvaluationTblPanel() {
	}
	
	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(330, 250, 150, 180, 180, 192);
		tableCellAlign(SwingConstants.CENTER, 0, 1, 2, 5);
		tableCellAlign(SwingConstants.RIGHT, 3, 4);
	}

	@Override
	protected String[] getColNames() {
		return new String[] {"품목명", "공급회사명", "재고수량", "판매가격", "공급가격", "재고평가"};
	}

	@Override
	protected Object[] toArray(IQEvaluation item) {
		return new Object[] {
				item.getP_name(),
				item.getS_name(),
				item.getIq_qty(),
				String.format("%,d    ", item.getP_price()),
				String.format("%,d    ", item.getP_cost()),
				item.getEvaluation()
			};
	}

	@Override
	public void updateRow(IQEvaluation item, int updateIdx) {
		model.setValueAt(item.getP_name(), updateIdx, 0);
		model.setValueAt(item.getS_name(), updateIdx, 1);
		model.setValueAt(item.getIq_qty(), updateIdx, 2);
		model.setValueAt(item.getP_price(), updateIdx, 3);
		model.setValueAt(item.getP_cost(), updateIdx, 4);
		model.setValueAt(item.getEvaluation(), updateIdx, 5);
	}


}
