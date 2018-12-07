package com.geekbrains.geekmarket.repositories;

import com.geekbrains.geekmarket.entities.OrderItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersItemRepository extends CrudRepository<OrderItem, Long> {
}
