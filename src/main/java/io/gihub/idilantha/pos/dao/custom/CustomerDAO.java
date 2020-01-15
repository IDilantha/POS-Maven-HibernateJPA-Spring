package io.gihub.idilantha.pos.dao.custom;


import io.gihub.idilantha.pos.dao.CrudDAO;
import io.gihub.idilantha.pos.entity.Customer;

public interface CustomerDAO extends CrudDAO<Customer, String> {

    String getLastCustomerId() throws Exception;

}
