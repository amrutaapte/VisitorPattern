package product;

import visitor.Visitor;


public class PackProduct extends Product implements Visitable{

		private int packVolume;
		private float packPrice;
		
		public PackProduct(String name, float unitPrice, int packVolume, float packPrice) {
			// Constructor for packProduct
			super(name, unitPrice);
			this.packVolume = packVolume;
			this.packPrice = packPrice;
		}
		
		public int getPackVolume() {
			return packVolume;
		}


		public void setPackVolume(int packVolume) {
			this.packVolume = packVolume;
		}


		public float getPackPrice() {
			return packPrice;
		}


		public void setPackPrice(float packPrice) {
			this.packPrice = packPrice;
		}

		@Override
		public void accept(Visitor visitor) {
			visitor.visit(this);
		}
	    
}
