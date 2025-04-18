package com.org.ecommerce.kafka;

import com.org.ecommerce.customer.CustomerResponse;
import com.org.ecommerce.order.PaymentMethod;
import com.org.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}