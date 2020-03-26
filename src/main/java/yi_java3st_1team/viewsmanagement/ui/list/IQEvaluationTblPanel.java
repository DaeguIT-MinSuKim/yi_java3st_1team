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
		return new String[] {"<html><span style='color:#000042'><b>품목명</b></span></html>",
				             "<html><span style='color:#000042'><b>공급회사명</b></span></html>",
				             "<html><span style='color:#000042'><b>재고수량</b></span></html>",
				             "<html><span style='color:#000042'><b>판매가격</b></span></html>",
				             "<html><span style='color:#000042'><b>공급가격</b></span></html>",
				             "<html><span style='color:#000042'><b>재고평가</b></span></html>"};
	}

	@Override
	protected Object[] toArray(IQEvaluation item) {
		String pName = String.format("%s", item.getP_name());
		String sName = String.format("%s", item.getS_name());
		String iqQty = String.format("%d", item.getIq_qty());
		String pPrice = String.format("%,d    ", item.getP_price());
		String pCost = String.format("%,d    ", item.getP_cost());
		String evalustion = String.format("%s", item.getEvaluation());
		
		switch(evalustion) {
			case "재고부족":
				pName = String.format("<html><span style='color:red'>%s</span></html>", item.getP_name());
				sName = String.format("<html><span style='color:red'>%s</span></html>", item.getS_name());
				iqQty = String.format("<html><span style='color:red'>%d</span></html>", item.getIq_qty());
				pPrice = String.format("<html><span style='color:red'>%,d　</span></html>", item.getP_price());
				pCost = String.format("<html><span style='color:red'>%,d　</span></html>", item.getP_cost());
				evalustion = String.format("<html><b><span style='color:red'>%s</span></b></html>", item.getEvaluation());
				break;
			case "재고과다":
				pName = String.format("<html><span style='color:blue'>%s</span></html>", item.getP_name());
				sName = String.format("<html><span style='color:blue'>%s</span></html>", item.getS_name());
				iqQty = String.format("<html><span style='color:blue'>%d</span></html>", item.getIq_qty());
				pPrice = String.format("<html><span style='color:blue'>%,d　</span></html>", item.getP_price());
				pCost = String.format("<html><span style='color:blue'>%,d　</span></html>", item.getP_cost());
				evalustion = String.format("<html><b><span style='color:blue'>%s</span></b></html>", item.getEvaluation());
				break;
		}
		return new Object[] {pName, sName, iqQty, pPrice, pCost, evalustion};
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
