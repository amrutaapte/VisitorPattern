/*
 * PriceCalculatorVisitor is an implementation of Visitor interface
 * It has different algorithms for different Products coming in as arguments
 * It returns totalPrice to TerminalImpl
 */

package visitor;

import product.PackProduct;
import product.UnitProduct;

public class PriceCalculatorVisitor implements Visitor{

	private float totalPrice;
	
	@Override
	public void visit(UnitProduct unitProduct) {
	// calculate total price
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
