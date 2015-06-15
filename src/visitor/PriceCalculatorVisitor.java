package visitor;

import product.PackProduct;
import product.UnitProduct;

public class PriceCalculatorVisitor implements Visitor{

	private float totalPrice;
	
	@Override
	public void visit(UnitProduct unitProduct) {
		totalPrice += unitProduct.getQty() * unitProduct.getUnitPrice();
	}

	@Override
	public void visit(PackProduct packProduct) {

		int numOfPacks = packProduct.getQty()/packProduct.getPackVolume();
		int units = packProduct.getQty()%packProduct.getPackVolume();
		
		totalPrice += (numOfPacks * packProduct.getPackPrice() + units * packProduct.getUnitPrice());
	}

	public float getTotalPrice(){
		return totalPrice;
	}
}
