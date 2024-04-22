package second_sem_project;
import javax.swing.*; 
public class Second_sem_project {
    public static void main(String[] args) {
        int start=Integer.parseInt(JOptionPane.showInputDialog("Welcome to the E-commerce System!\nTo start the system enter 1 if you don't enter any number"));
        
        String customerName=JOptionPane.showInputDialog("Enter your name");
        int customerID=Integer.parseInt(JOptionPane.showInputDialog("Enter your id:"));
        int nProduct =Integer.parseInt(JOptionPane.showInputDialog("What is the number of products you want to buy?"));
        Clothing_product cloothprod=new Clothing_product();
        Electronic_product electroprod=new Electronic_product();
        Book_product bookprod=new Book_product();
        Cart c1=new Cart(1,nProduct);
        Customer cust1=new Customer();
        cust1.setCustomerName(customerName);
        for(int i=0; i<nProduct; i++){
            int prod_num=Math.abs(Integer.parseInt(JOptionPane.showInputDialog("Choose your product: 1)clooth 2)Eloctronic device 3)Book")));
            if (prod_num==1){
                String prod_name=JOptionPane.showInputDialog("Enter the product name");
                cloothprod.setName(prod_name);
                int prod_id=Math.abs(Integer.parseInt(JOptionPane.showInputDialog("Enter the product id:")));
                cloothprod.setProductId(prod_id);
                String size=JOptionPane.showInputDialog("Enter the size");
                cloothprod.setSize(size);
                String fabric=JOptionPane.showInputDialog("Enter the kind of fabric");
                cloothprod.setFabric(fabric);
                float prod_price=Math.abs(Float.parseFloat(JOptionPane.showInputDialog("Enter the product price:")));
                cloothprod.setPrice(prod_price);
                c1.addProduct(cloothprod);
            }
            if (prod_num==2){
                String prod_name=JOptionPane.showInputDialog("Enter the category of the device");
                electroprod.setName(prod_name);
                int prod_id=Integer.parseInt(JOptionPane.showInputDialog("Enter the product id"));
                electroprod.setProductId(prod_id);
                String brand=JOptionPane.showInputDialog("Enter the brand of the device");
                electroprod.setBrand(brand);
                int warranty=Math.abs(Integer.parseInt(JOptionPane.showInputDialog("Enter the warranty of the product")));
                electroprod.setWarrantyProduct(warranty);
                float prod_price=Float.parseFloat(JOptionPane.showInputDialog("Enter the product price"));
                electroprod.setPrice(prod_price);
                c1.addProduct(electroprod);
            }
            if (prod_num==3){
                String prod_name=JOptionPane.showInputDialog("Enter the name of the book");
                bookprod.setName(prod_name);
                int prod_id=Math.abs(Integer.parseInt(JOptionPane.showInputDialog("Enter the book id")));
                bookprod.setProductId(prod_id);
                String author=JOptionPane.showInputDialog("Enter the name of the author");
                bookprod.setAuthor(author);
                String publisher=JOptionPane.showInputDialog("Enter the name of the publisher");
                bookprod.setPublisher(publisher);
                float prod_price=Math.abs(Float.parseFloat(JOptionPane.showInputDialog("Enter the product price")));
                bookprod.setPrice(prod_price);
                c1.addProduct(bookprod);
            }
        }
        c1.placeOrder();
        Order o1=new Order(customerID,nProduct,c1,cust1);
        if(c1.ans==1){
            o1.printOrder();
        }
        else{
            System.out.println("Thank you for using our E-commerce system ");
        }
    }
}
    

