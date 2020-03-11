package yi_java3st_1team.ordermanagement.dto;

import yi_java3st_1team.clientmanagement.dto.Supplier;
import yi_java3st_1team.productmanagement.dto.Product;

public class InventoryQuantity {
	private Product iqPname;
	private Supplier iqSname;
	private Product iqPprice;
	private Product iqPcost;
	private int iqNo;
	private Product iqPno;
	private int iqQty;

	public InventoryQuantity() {
		// TODO Auto-generated constructor stub
	}

	public InventoryQuantity(int iqNo) {
		this.iqNo = iqNo;
	}

	public InventoryQuantity(int iqNo, Product iqPno, int iqQty) {
		this.iqNo = iqNo;
		this.iqPno = iqPno;
		this.iqQty = iqQty;
	}

	public InventoryQuantity(Product iqPno, int iqQty) {
		this.iqPno = iqPno;
		this.iqQty = iqQty;
	}

	public InventoryQuantity(Product iqPname, Supplier iqSname, Product iqPprice, Product iqPcost, int iqQty) {
		this.iqPname = iqPname;
		this.iqSname = iqSname;
		this.iqPprice = iqPprice;
		this.iqPcost = iqPcost;
		this.iqQty = iqQty;
	}

	public InventoryQuantity(Product iqPname, Supplier iqSname, Product iqPprice, Product iqPcost, int iqNo,
			Product iqPno, int iqQty) {
		this.iqPname = iqPname;
		this.iqSname = iqSname;
		this.iqPprice = iqPprice;
		this.iqPcost = iqPcost;
		this.iqNo = iqNo;
		this.iqPno = iqPno;
		this.iqQty = iqQty;
	}

	public Product getIqPname() {
		return iqPname;
	}

	public void setIqPname(Product iqPname) {
		this.iqPname = iqPname;
	}

	public Supplier getIqSname() {
		return iqSname;
	}

	public void setIqSname(Supplier iqSname) {
		this.iqSname = iqSname;
	}

	public Product getIqPprice() {
		return iqPprice;
	}

	public void setIqPprice(Product iqPprice) {
		this.iqPprice = iqPprice;
	}

	public Product getIqPcost() {
		return iqPcost;
	}

	public void setIqPcost(Product iqPcost) {
		this.iqPcost = iqPcost;
	}

	public int getIqNo() {
		return iqNo;
	}

	public void setIqNo(int iqNo) {
		this.iqNo = iqNo;
	}

	public Product getIqPno() {
		return iqPno;
	}

	public void setIqPno(Product iqPno) {
		this.iqPno = iqPno;
	}

	public int getIqQty() {
		return iqQty;
	}

	public void setIqQty(int iqQty) {
		this.iqQty = iqQty;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((iqPno == null) ? 0 : iqPno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InventoryQuantity other = (InventoryQuantity) obj;
		if (iqPno == null) {
			if (other.iqPno != null)
				return false;
		} else if (!iqPno.equals(other.iqPno))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format(
				"InventoryQuantity [iqPname=%s, iqSname=%s, iqPprice=%s, iqPcost=%s, iqNo=%s, iqPno=%s, iqQty=%s]",
				iqPname, iqSname, iqPprice, iqPcost, iqNo, iqPno, iqQty);
	}

}
