package io.gihub.idilantha.pos.dao.custom.impl;


import io.gihub.idilantha.pos.dao.CrudDAOImpl;
import io.gihub.idilantha.pos.dao.custom.CustomerDAO;
import io.gihub.idilantha.pos.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDAOImpl extends CrudDAOImpl<Customer,String> implements CustomerDAO {

    @Override
    public String getLastCustomerId() throws Exception {
        return (String) entityManager.createNativeQuery("SELECT customerId FROM Customer ORDER BY customerId DESC LIMIT 1").getSingleResult();

    }

}
