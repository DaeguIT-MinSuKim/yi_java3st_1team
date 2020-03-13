package yi_java3st_1team.ordermanagement.ui.list;

import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.ui.list.AbstractTblPanel;
import yi_java3st_1team.ordermanagement.dto.Order;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class ClientOCheckTblPanel extends AbstractTblPanel<Order> {
	public ClientOCheckTblPanel() {
		initialize();
	}
	private void initialize() {
		table.setAutoscrolls(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	}

	private int total;
	private String check;

	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(225,285,205,225,225,205);
		tableCellAlign(SwingConstants.CENTER, 0,1,2,4,5);
		tableCellAlign(SwingConstants.RIGHT, 3);
		
	}

	@Override
	protected Object[] getColNames() {
		return new String[] {
				 "<html><span style='color:#000042'><b>주문번호</b></html>",
				 "<html><span style='color:#000042'><b>품목명</b></html>",
				 "<html><span style='color:#000042'><b>주문수량</b></html>",
				 "<html><span style='color:#000042'><b>주문가격</b></html>",
				 "<html><span style='color:#000042'><b>주문일자</b></html>",
				 "<html><span style='color:#000042'><b>주문확인</b></html>"				
		};
	}

	@Override
	protected Object[] toArray(Order item) {
		double fifty = 0.1;
		double hund = 0.15;
		if(item.getoQty()<50) {
			total = item.getoPname().getpPrice()*item.getoQty();
		}else if(item.getoQty()>=50 && item.getoQty()<100) {
			int price = item.getoPname().getpPrice()*item.getoQty();
			int sub = (int) Math.floor(price*fifty);
			total = price-sub;
		}else if(item.getoQty()>=100) {
			int price = item.getoPname().getpPrice()*item.getoQty();
			int sub = (int) Math.floor(price*hund);
			total = price-sub;
		}
		
		if(item.getoOk()==0) {
			check = "N";
		}else {
			check = "Y";
		}
		
		return new Object[] {
				String.format("O%04d", item.getoNo()),
				item.getoPname().getpName(),
				item.getoQty(),
				String.format("%,d원 ", total),
				String.format("%tF", item.getoDate()),
				check
		};
	}

	@Override
	public void updateRow(Order item, int updateIdx) {
		model.setValueAt(String.format("O%04d", item.getoNo()), updateIdx, 0);
		model.setValueAt(item.getoPname().getpName(), updateIdx, 1);
		model.setValueAt(item.getoQty(), updateIdx, 2);
		model.setValueAt(String.format("%,d원 ", total), updateIdx, 3);
		model.setValueAt(String.format("%tF", item.getoDate()), updateIdx, 4);
		model.setValueAt(check, updateIdx, 5);
		
	}

}
