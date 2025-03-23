package com.challenge.controller.impl;

import com.challenge.controller.OrderController;
import com.challenge.dto.OrderDto;
import com.challenge.dto.request.CreateOrderRequestDto;
import com.challenge.dto.response.CreateOrderResponseDto;
import com.challenge.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderControllerImpl implements OrderController {

    private final OrderService orderService;

    @Override
    public ResponseEntity<CreateOrderResponseDto> buy(CreateOrderRequestDto requestDto) {
        return new ResponseEntity<>(orderService.createBuyOrder(requestDto), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<CreateOrderResponseDto> sell(CreateOrderRequestDto requestDto) {
        return new ResponseEntity<>(orderService.createSellOrder(requestDto), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> cancel(Integer orderId) {
        orderService.cancelOrder(orderId);

        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<List<OrderDto>> findByCustomerId(Integer customerId, LocalDate startDate, LocalDate endDate) {
        return ResponseEntity.ok(orderService.findByCustomerIdAndCreateDateBetween(customerId, startDate, endDate));
    }


}
