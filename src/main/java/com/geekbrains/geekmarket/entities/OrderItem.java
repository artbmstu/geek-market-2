package com.geekbrains.geekmarket.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "orders_item")
@Data
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "create_at")
    private Integer quantity;

    @Column(name="total_price")
    private BigDecimal totalPrice;

    @ManyToOne
    @JoinColumn(name = "orders_item")
    private Order order;

    @OneToOne(mappedBy = "orders_item")
    private Product product;
}
