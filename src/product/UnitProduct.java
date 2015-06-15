/*
 * UnitProduct represents all products that only have unit prices.
 * This is a POJO which implements accept method of Visitable interface.
 * It extends Product class which has common features of all products
 */


package product;
import visitor.Visitor;


public class UnitProduct extends Product implements Visitable{

	public UnitProduct(String name, float price) {
		//constructor for unitProduct
		super(name, price);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
