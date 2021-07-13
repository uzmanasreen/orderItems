package com.orderItems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderItems.entity.UserOrderItems;
@Repository
public interface OrderItemRepository extends JpaRepository<UserOrderItems, Long>{

}
