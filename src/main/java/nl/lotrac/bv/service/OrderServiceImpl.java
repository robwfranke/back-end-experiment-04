package nl.lotrac.bv.service;

import nl.lotrac.bv.model.Order;
import nl.lotrac.bv.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public Collection<Order> getOrder() {

//        return null;
       return orderRepository.findAll();
    }
}
