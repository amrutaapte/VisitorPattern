/*
 * Visitable interface has accept method implemented by the UnitProduct and PackProduct
 * The accept method accepts a visitor and the Visitable object passes itself to the visitor's visit method
 *
 */

package product;
import visitor.Visitor;


public interface Visitable {

	public void accept(Visitor visitor);

	public int getQty();

	public void setQty(int i);
}
