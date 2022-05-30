package Dessert;

public class Cookie extends DessertItems {
	int quantity,stock;
    int cookieStock = 150;
    public Cookie(int quantity) {

        this.quantity= quantity;
    }

    public int getCost() {
        int cookiePrice = 3;
        int cookieTax = 10;
        return (cookiePrice*70*quantity + cookieTax);
    }
    public int getStock(int stock)
    {
        this.stock = stock;
        return stock+cookieStock;
    }
}
