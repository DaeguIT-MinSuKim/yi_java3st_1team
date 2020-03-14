package yi_java3st_1team.viewsmanagement.ui.list;

import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.ui.list.AbstractTblPanel;
import yi_java3st_1team.viewsmanagement.dto.TransactionStatement;

@SuppressWarnings("serial")
public class TSTblPanel extends AbstractTblPanel<TransactionStatement> {
	public TSTblPanel() {
	}
	
	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(160, 115, 180, 290, 65, 120, 120, 120, 120);
		tableCellAlign(SwingConstants.CENTER, 0, 1, 2, 3, 4);
		tableCellAlign(SwingConstants.RIGHT, 5, 6, 7, 8);
	}

	@Override
	protected String[] getColNames() {
		return new String[] {"<html><span style='color:#000042'><b>공급회사명</b></span></html>",
				             "<html><span style='color:#000042'><b>주문일자</b></span></html>",
				             "<html><span style='color:#000042'><b>고객상호명</b></span></html>",
				             "<html><span style='color:#000042'><b>품목명</b></span></html>",
				             "<html><span style='color:#000042'><b>수량</b></span></html>",
				             "<html><span style='color:#000042'><b>단가</b></span></html>",
				             "<html><span style='color:#000042'><b>금액</b></span></html>",
				             "<html><span style='color:#000042'><b>세금</b></span></html>",
				             "<html><span style='color:#000042'><b>총납품금액</b></span></html>"};
	}

	@Override
	protected Object[] toArray(TransactionStatement item) {
		return new Object[] {
				item.getS_name(),
				item.getO_date(),
				item.getC_name(),
				item.getP_name(),
				item.getO_qty(),
				String.format("%,d    ", item.getP_price()),
				String.format("%,d    ", item.getSalesAmount()),
				String.format("%,d    ", item.getTax()),
				String.format("%,d    ", item.getTotalDA())
			};
	}

	@Override
	public void updateRow(TransactionStatement item, int updateIdx) {
		model.setValueAt(item.getS_name(), updateIdx, 0);
		model.setValueAt(item.getO_date(), updateIdx, 1);
		model.setValueAt(item.getC_name(), updateIdx, 2);
		model.setValueAt(item.getP_name(), updateIdx, 3);
		model.setValueAt(item.getO_qty(), updateIdx, 4);
		model.setValueAt(item.getP_price(), updateIdx, 5);
		model.setValueAt(item.getSalesAmount(), updateIdx, 6);
		model.setValueAt(item.getTax(), updateIdx, 7);
		model.setValueAt(item.getTotalDA(), updateIdx, 8);
	}

}
