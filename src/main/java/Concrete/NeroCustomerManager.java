package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

    @Override
    public void Save(Customer customer) throws Exception {
        super.Save(customer);
    }
}
