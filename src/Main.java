import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setName("Book");
        shoppingCart.setPrice(100);
        shoppingCart.setQuantity(10);
        shoppingCart.saveCart(shoppingCart);



        ShoppingCart shoppingCart2 = new ShoppingCart();
        shoppingCart2.setName("Bag");
        shoppingCart2.setPrice(50);
        shoppingCart2.setQuantity(1);

        shoppingCart.loadCart();



        }
    }
