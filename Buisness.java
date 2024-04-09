public class Buisness implements Payable{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductQtySupplied() {
        return productQtySupplied;
    }

    public void setProductQtySupplied(int productQtySupplied) {
        this.productQtySupplied = productQtySupplied;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    private String name;
    private int productQtySupplied;
    private double productPrice;
    public Buisness(String name,int productQtySupplied,double productPrice){
        this.name=name;
        this.productPrice=productPrice;
        this.productQtySupplied=productQtySupplied;

    }
    @Override
    public double calculatePay() {
        return 0;
    }
}
