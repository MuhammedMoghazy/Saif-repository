package second_sem_project;
import javax.swing.JOptionPane;
public class Cart {
    private int customerId;
    private int nProduct;
    Product[] products;
    int ans=1;
    public Cart() {
    }
    public Cart(int customerId, int nProduct) {
        this.customerId = customerId;
        this.nProduct = nProduct;
       products = new Product[this.nProduct];// this is for making array length.
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public  int getnProduct() {
        return nProduct;
    }
    public void setnProduct(int nProduct) {
        this.nProduct = Math.abs(nProduct);
    }
    public Product[] getProducts() {
        return products;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public void addProduct(Product product){
        for(int i=0; i<nProduct; i++){
            if(products[i]==null){
                products[i]=product;
                break;
            }
        }
    }
    public void removeProducts(){
        for(int i=0; i<nProduct; i++){
            if(products[i]!=null){
                products[i]=null;
            }
        }
    }
    public float calculateTotal(){
        float sum=0;
        for(int i=0; i<nProduct; i++){
           
            sum +=products[i].Price;
        }
        return sum;
    }
    public void placeOrder(){
       this.ans=Integer.parseInt(JOptionPane.showInputDialog("Total price is "+calculateTotal()+" $"+"\n Do you want to place order?"+"\n 1-yes or 2-no"));
    }
}
