
public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal()); // we dont need this code in spring
        //we just write CustomerManager customerManager with Factory design pattern
        customerManager.add();

    }
    //IOC Inversion OF CONTROL
    //DEPENDENCY INJECTION
    //CLEAN CODE
    //SPAGETTI
    //SOLID
    //DAL DATA ACCESS LAYER

}