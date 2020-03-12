package yi_java3st_1team.ordermanagement.ui.list;

import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.ui.list.AbstractTblPanel;
import yi_java3st_1team.ordermanagement.dto.Order;

@SuppressWarnings("serial")
public class ClientOCheckTblPanel extends AbstractTblPanel<Order> {
	public ClientOCheckTblPanel() {
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
			System.out.println(sub);
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
		// TODO Auto-generated method stub
		
	}

}
