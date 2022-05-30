package Dessert;

public class Candy extends DessertItems {
	int quantity, stock;
    int availableStock = 120;
    public Candy(int quantity) {
        this.quantity= quantity;
    }

    public int getCost() {
        int candyPrice = 2;
        int candyTax = 10;
        return (candyPrice*60*quantity + candyTax);
    }
    public int getStock(int stock)
    {
        this.stock = stock;
        return stock+availableStock;
    }
}
