package yi_java3st_1team.productmanagement.ui.list;

import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.ui.list.AbstractTblPanel;
import yi_java3st_1team.productmanagement.dto.Product;

@SuppressWarnings("serial")
public class SWListTblPanel extends AbstractTblPanel<Product> {

	public SWListTblPanel() {

	}

	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(80, 100, 260, 80, 80, 130, 100, 100);
		tableCellAlign(SwingConstants.CENTER, 0, 1, 2, 5, 6, 7);
		tableCellAlign(SwingConstants.RIGHT, 3, 4);
	}

	@Override
	protected Object[] getColNames() {
		return new String[] {"품목번호","분류명","품목명","공급가격","판매가격","공급회사명","최초재고수량","최초등록일자"};
	}

	@Override
	protected Object[] toArray(Product item) {
		return new Object[] {
			String.format("P%04d", item.getpNo()),
			item.getpCate().getCateName(),
			item.getpName(),
			String.format("%,d원", item.getpCost()),
			String.format("%,d원", item.getpPrice()),
			item.getpSno().getsName(),
			item.getpQty(),
			String.format("%tF", item.getpDate())
		};
	}

	@Override
	public void updateRow(Product item, int updateIdx) {
		model.setValueAt(String.format("P%04d", item.getpNo()), updateIdx, 0);
		model.setValueAt(item.getpCate().getCateName(), updateIdx, 1);
		model.setValueAt(item.getpName(), updateIdx, 2);
		model.setValueAt(item.getpCost(), updateIdx, 3);
		model.setValueAt(item.getpPrice(), updateIdx, 4);
		model.setValueAt(item.getpSno().getsName(), updateIdx, 5);
		model.setValueAt(item.getpQty(), updateIdx, 6);
		model.setValueAt(item.getpDate(), updateIdx, 7);
		
	}

}
