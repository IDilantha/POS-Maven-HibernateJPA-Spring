package io.gihub.idilantha.pos.dao.custom;


import dao.CrudDAO;
import entity.Customer;

public interface CustomerDAO extends CrudDAO<Customer, String> {

    String getLastCustomerId() throws Exception;

}
