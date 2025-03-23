package com.challenge.mapper;

import com.challenge.dto.OrderDto;
import com.challenge.entity.OrderEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderEntity toEntity(OrderDto orderDto);

    OrderDto toDto(OrderEntity orderEntity);

}
