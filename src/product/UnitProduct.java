package product;
import visitor.Visitor;


public class UnitProduct extends Product implements Visitable{

	public UnitProduct(String name, float price) {
		super(name, price);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
