package com.applestore.applestore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applestore.applestore.domain.Order;
import com.applestore.applestore.domain.OrderDetail;
import com.applestore.applestore.domain.Product;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    List<OrderDetail> findByOrder(Order order);
    
    void deleteByProduct_id(long id);
    
    List<OrderDetail> findByProduct(Product product);

}
