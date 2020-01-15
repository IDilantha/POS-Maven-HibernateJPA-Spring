package io.gihub.idilantha.pos.dao.custom;


import io.gihub.idilantha.pos.dao.CrudDAO;
import io.gihub.idilantha.pos.entity.OrderDetail;
import io.gihub.idilantha.pos.entity.OrderDetailPK;

public interface OrderDetailDAO extends CrudDAO<OrderDetail, OrderDetailPK> {

    boolean existsByItemCode(String itemCode) throws Exception;

}
