package yi_java3st_1team.clientmanagement.ui.list;

import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.dto.Supplier;

@SuppressWarnings("serial")
public class SCListTblPanel extends AbstractTblPanel<Supplier> {

	public SCListTblPanel() {

	}

	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(80, 120, 100, 300, 100, 100);
		tableCellAlign(SwingConstants.CENTER, 0, 1, 2, 3, 4, 5);
	}

	@Override
	protected Object[] getColNames() {
		return new String[] { "<html><span style='color:#000042'><b>회사번호</b></html>",
				"<html><span style='color:#000042'><b>회사명</b></html>",
				"<html><span style='color:#000042'><b>사업자 등록번호</b></html>",
				"<html><span style='color:#000042'><b>주 소</b></html>",
				"<html><span style='color:#000042'><b>전화번호</b></html>",
				"<html><span style='color:#000042'><b>Fax 번호</b></html>" };
	}

	@Override
	protected Object[] toArray(Supplier item) {
		return new Object[] { String.format("S%04d", item.getsNo()), item.getsName(), item.getsBln(),
				item.getsAddress(), item.getsTel(), item.getsFax() };
	}

	@Override
	public void updateRow(Supplier item, int updateIdx) {
		model.setValueAt(String.format("S%04d", item.getsNo()), updateIdx, 0);
		model.setValueAt(item.getsName(), updateIdx, 1);
		model.setValueAt(item.getsBln(), updateIdx, 2);
		model.setValueAt(item.getsAddress(), updateIdx, 3);
		model.setValueAt(item.getsTel(), updateIdx, 4);
		model.setValueAt(item.getsFax(), updateIdx, 5);
	}

}
