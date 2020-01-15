package io.gihub.idilantha.pos.dao.custom;


import io.gihub.idilantha.pos.dao.CrudDAO;
import io.gihub.idilantha.pos.entity.Item;

public interface ItemDAO extends CrudDAO<Item, String> {

    String getLastItemCode() throws Exception;
}
