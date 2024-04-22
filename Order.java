package second_sem_project;
public class Order  {
    private int orderId=1;
    private int customerId;
    Cart cart = new Cart();
    Customer customer=new Customer();

    public Order() {
    }

    public Order(int customerId, int nProduct,Cart cart,Customer customer) {
        this.customer=customer;
        this.cart = cart;
        this.customerId = customerId;
    }
    
    public void printOrder(){
        System.out.println("Here is your order summery: ");
        System.out.println("Customer name: "+customer.getCustomerName());
        System.out.println("Customer ID: "+customerId);
        System.out.println("Your order id: 1");
        for(int i=0; i<cart.getnProduct(); i++ ){
            System.out.println(cart.products[i].getName()+" - "+cart.products[i].getPrice()+" $");
        }
        System.out.println("Total price: "+cart.calculateTotal());
        System.out.println("Thank you for using our E-commerce system ");
    }
    
}
