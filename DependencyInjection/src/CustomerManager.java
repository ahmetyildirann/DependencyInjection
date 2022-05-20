
public class CustomerManager {

    private IcustomerDal icustomerDal;

    public CustomerManager(IcustomerDal icustomerDal) {
        this.icustomerDal = icustomerDal;
    }

    public void add(){
        //business case
        //CustomerDal customerDal =new CustomerDal();
        icustomerDal.add();
    }
}
