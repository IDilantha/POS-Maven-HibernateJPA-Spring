package io.gihub.idilantha.pos.dao.custom.impl;


import io.gihub.idilantha.pos.dao.CrudDAOImpl;
import io.gihub.idilantha.pos.dao.custom.ItemDAO;
import io.gihub.idilantha.pos.entity.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemDAOImpl extends CrudDAOImpl<Item,String> implements ItemDAO {

    @Override
    public String getLastItemCode() throws Exception {
        return (String) entityManager.createNativeQuery("SELECT code FROM Item ORDER BY code DESC LIMIT 1").getSingleResult();
    }

}
