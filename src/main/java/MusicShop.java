import interfaces.ISell;
import products.Product;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<Product> stock;
    private double till;

    public MusicShop(double till){
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public int getStock() {
        return stock.size();
    }

    public void setStock(ArrayList<Product> stock) {
        this.stock = stock;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void buyStock(Product item){
        if(getTill() > item.getCostPrice()){
            this.stock.add(item);
            setTill(getTill()-item.getCostPrice());
        }
    }

    public void sellStock(Product item){
        if(this.stock.contains(item)) {
            setTill(getTill() + item.getRetailPrice());
            this.stock.remove(item);
        }
    }
}
