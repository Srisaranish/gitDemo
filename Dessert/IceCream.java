package Dessert;

public class IceCream extends DessertItems {
	int quantity, stock;
    int iceCreamStock=200;
    public IceCream(int quantity) {
        this.quantity=quantity;
    }
    public int getCost() {
        int iceCreamPrice = 50;
        int iceCreamTax = 10;
        return (iceCreamPrice*quantity + iceCreamTax);
    }
    public int getStock(int stock)
    {
        this.stock = stock;
        return stock+iceCreamStock;
    }
}
