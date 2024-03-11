import java.io.*;

public class ShoppingCart implements Serializable {


    String name;
    double price;
    int quantity;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void saveCart(ShoppingCart shoppingCart) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("ShoppingCart.ser");
        ObjectOutputStream saveCart = new ObjectOutputStream(fileOutputStream);

        saveCart.writeObject(shoppingCart);

    }

    public void loadCart() throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("ShoppingCart.ser");
        ObjectInputStream loadFile = new ObjectInputStream(fileInputStream);

        ShoppingCart dz = (ShoppingCart) loadFile.readObject();

        System.out.println(dz.getName());
        System.out.println(dz.getPrice());
        System.out.println(dz.getQuantity());
    }
}
