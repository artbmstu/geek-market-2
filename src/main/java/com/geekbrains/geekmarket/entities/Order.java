package com.geekbrains.geekmarket.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "create_at")
    private String createAt;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToOne(mappedBy = "orders")
    private OrderStatus orderStatus;

    @OneToMany(mappedBy = "orders")
    private List<OrderItem> orderItems;
}
