package visitor;

import product.PackProduct;
import product.UnitProduct;

public interface Visitor {

	void visit(UnitProduct unitProduct);
	void visit(PackProduct packProduct);
}
