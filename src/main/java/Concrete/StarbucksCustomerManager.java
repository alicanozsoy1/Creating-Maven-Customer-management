package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    ICustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        _customerCheckService = customerCheckService;
    }

    @Override
    public void Save(Customer customer) throws Exception {
        if (_customerCheckService.CheckIfRealPerson(customer)){
            super.Save(customer);
        } else {
            throw new Exception("Not a valid person");
        }

    }

}
