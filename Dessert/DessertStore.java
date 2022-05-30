package Dessert;

import java.util.Scanner;

public class DessertStore {

	public static void main(String[] args) {
		
		System.out.println("Type 1 if you are the Owner(or) Type 2 if you are a Customer");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==1)
        {

            System.out.println(" Enter dessert item to be added : ");
            String newItem = sc.next();
            System.out.println(" Enter Quantity to be added : ");
            int stock = sc.nextInt();
            if(newItem.equalsIgnoreCase("candy"))
            {
                Candy candy = new Candy(stock);
                System.out.println(" Item added to storage ");
                System.out.println(" Total Candy stock available now : "+candy.getStock(stock));
            }

            if(newItem.equalsIgnoreCase("cookie"))
            {
                Cookie cookie =new Cookie(stock);
                System.out.println(" Item added to storage ");
                System.out.println(" Total Cookie stock available now : "+cookie.getStock(stock));
            }

            if(newItem.equalsIgnoreCase("IceCream"))
            {
                IceCream iceCream = new IceCream(stock);
                System.out.println(" Item added to storage ");
                System.out.println(" Total Ice cream stock available now : "+iceCream.getStock(stock));
            }

        }


else if(num==2)
        {
            System.out.println("\n Enter your order item ");
            String newOrder = sc.next();
            System.out.println(" Enter quantity ");
            int quantity = sc.nextInt();
            if(newOrder.equalsIgnoreCase("Candy"))
            {
                Candy candy = new Candy(quantity);
                System.out.println(" total cost in rupees = "+candy.getCost());
            }

            if(newOrder.equalsIgnoreCase("Cookie"))
            {
                Cookie cookie = new Cookie(quantity);
                System.out.println(" total cost in rupees = "+cookie.getCost());
            }

            if(newOrder.equalsIgnoreCase("IceCream"))
            {
                IceCream iceCream = new IceCream(quantity);
                System.out.println(" total cost in rupees = "+iceCream.getCost());
            }
        }
    }
}


