package com.challenge.service;

import com.challenge.dto.OrderDto;
import com.challenge.dto.request.CreateOrderRequestDto;
import com.challenge.dto.response.CreateOrderResponseDto;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {

    CreateOrderResponseDto createBuyOrder(CreateOrderRequestDto requestDto);

    CreateOrderResponseDto createSellOrder(CreateOrderRequestDto requestDto);

    void cancelOrder(Integer orderId);

    List<OrderDto> findByCustomerIdAndCreateDateBetween(Integer customerId, LocalDate startDate, LocalDate endDate);

}
