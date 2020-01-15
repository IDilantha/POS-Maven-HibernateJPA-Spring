package io.gihub.idilantha.pos.business.custom;


import io.gihub.idilantha.pos.business.SuperBO;
import io.gihub.idilantha.pos.dto.OrderDTO;
import io.gihub.idilantha.pos.dto.OrderDTO2;

import java.util.List;

public interface OrderBO extends SuperBO {

    int getLastOrderId() throws Exception;

    void placeOrder(OrderDTO orderDTO) throws Exception;

    List<OrderDTO2> getOrderInfo() throws Exception;

}
