package Abstract;

import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{
    @Override
    public void Save(Customer customer) throws Exception {
        System.out.println("Saved to db : " + customer.Id + "-" + customer.FirstName + " " + customer.LastName + " " + customer.DateOfBirth );
        StarPoint(customer);
    }

    @Override
    public void Delete(Customer customer) {
        System.out.println("Customer id : " + customer.Id + " -> Deleted to db" );
    }

    @Override
    public void StarPoint(Customer customer) {
        System.out.println(customer.FirstName + " " + customer.LastName + " Earned a '*' ");
    }
}
