package com.org.ecommerce.orderline;

import com.org.ecommerce.order.Order;

public record OrderLineRequest(
        Integer id,
        Order order,
        Integer productId,
        double quantity
) {
}