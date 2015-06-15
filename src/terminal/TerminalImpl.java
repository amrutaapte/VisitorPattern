package terminal;

import java.util.ArrayList;
import java.util.List;

import product.PackProduct;
import product.Product;
import product.UnitProduct;
import product.Visitable;
import visitor.PriceCalculatorVisitor;

public class TerminalImpl implements Terminal{

	private static List<Product> productMasterList; // master list of all available products
	private	List<Visitable> scannedItems; // list of scanned items

	public TerminalImpl() {
		productMasterList = new ArrayList<Product>();
		scannedItems = new ArrayList<Visitable>();
	}

	public void setPricing() {				
		// create a master list of all available products with their prices

		Product A = new PackProduct("A", 2, 4, 7);
		Product B = new UnitProduct("B", 12f);
		Product C = new PackProduct("C", 1.25f, 6, 6);
		Product D = new UnitProduct("D", 0.15f);

		productMasterList.add(A);
		productMasterList.add(B);
		productMasterList.add(C);
		productMasterList.add(D);

	}

	public void scan(String item) {
		// Scan input string and add to the list of scanned items

		for(Product p : productMasterList){
			if(p.getName().equals(item)){
				if(scannedItems.contains(p)){
					int index = scannedItems.indexOf(p);
					int qty = scannedItems.get(index).getQty();
					scannedItems.get(index).setQty(++qty);
				}
				else{
					p.setQty(1);
					scannedItems.add((Visitable) p);
				}
			}
		}			

	}

	public float total() {
		// Iterate over all scanned products to return total price

		float total = 0;
		PriceCalculatorVisitor priceCalculator = new PriceCalculatorVisitor();
		for (Visitable p : scannedItems){
			p.accept(priceCalculator);
		}   
		total = priceCalculator.getTotalPrice();
		return total;
	}

}
