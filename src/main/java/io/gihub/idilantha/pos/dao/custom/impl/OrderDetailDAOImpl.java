package io.gihub.idilantha.pos.dao.custom.impl;


import io.gihub.idilantha.pos.dao.CrudDAOImpl;
import io.gihub.idilantha.pos.dao.custom.OrderDetailDAO;
import io.gihub.idilantha.pos.entity.OrderDetail;
import io.gihub.idilantha.pos.entity.OrderDetailPK;
import org.springframework.stereotype.Component;

import javax.persistence.Query;

@Component
public class OrderDetailDAOImpl extends CrudDAOImpl<OrderDetail, OrderDetailPK> implements OrderDetailDAO {

    @Override
    public boolean existsByItemCode(String itemCode) throws Exception {
        Query nativeQuery = entityManager.createNativeQuery("SELECT * FROM OrderDetail WHERE itemCode=?");
        nativeQuery.setParameter(1,itemCode);
        return nativeQuery.getSingleResult() != null ;
    }
}
