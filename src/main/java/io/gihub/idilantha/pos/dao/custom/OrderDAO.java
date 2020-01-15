package io.gihub.idilantha.pos.dao.custom;


import io.gihub.idilantha.pos.dao.CrudDAO;
import io.gihub.idilantha.pos.entity.Order;

public interface OrderDAO extends CrudDAO<Order, Integer> {

    int getLastOrderId() throws Exception;

    boolean existsByCustomerId(String customerId) throws Exception;

}
