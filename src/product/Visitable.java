package product;
import visitor.Visitor;


public interface Visitable {

	public void accept(Visitor visitor);

	public int getQty();

	public void setQty(int i);
}
