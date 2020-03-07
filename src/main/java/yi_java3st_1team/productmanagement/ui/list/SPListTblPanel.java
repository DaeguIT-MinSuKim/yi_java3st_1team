package yi_java3st_1team.productmanagement.ui.list;

import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.ui.list.AbstractTblPanel;
import yi_java3st_1team.productmanagement.dto.SupplierPurchase;

@SuppressWarnings("serial")
public class SPListTblPanel extends AbstractTblPanel<SupplierPurchase> {

	public SPListTblPanel() {}

	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(80, 260, 130, 80, 80, 100);
		tableCellAlign(SwingConstants.CENTER, 0, 1, 2, 4, 5);
		tableCellAlign(SwingConstants.RIGHT, 3);
	}

	@Override
	protected Object[] getColNames() {
		return new String[] {"매입번호", "품목명", "공급회사명", "매입가격", "매입수량", "매입일자"};
	}

	@Override
	protected Object[] toArray(SupplierPurchase item) {
		return new Object[] {
				String.format("SP%04d", item.getSpNo()),
				item.getSpPname().getpName(),
				item.getSpSname().getsName(),
				String.format("%,d원",item.getSpPcost().getpCost()),
				item.getSpQty(),
				String.format("%tF", item.getSpDate())
		};
	}

	@Override
	public void updateRow(SupplierPurchase item, int updateIdx) {
		model.setValueAt(String.format("SP%04d", item.getSpNo()), updateIdx, 0);
		model.setValueAt(item.getSpPname().getpName(), updateIdx, 1);
		model.setValueAt(item.getSpSname().getsName(), updateIdx, 2);
		model.setValueAt(item.getSpPcost().getpCost(), updateIdx, 3);
		model.setValueAt(item.getSpQty(), updateIdx, 4);
		model.setValueAt(item.getSpDate(), updateIdx, 5);
		
	}

}
