package second_sem_project;
public class Electronic_product extends Product {
    private String brand;
    private int warrantyProduct;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyProduct() {
        return warrantyProduct;
    }

    public void setWarrantyProduct(int warrantyProduct) {
        this.warrantyProduct = Math.abs(warrantyProduct);
    }
    
}
