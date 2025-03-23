package com.challenge.mapper;

import com.challenge.dto.AssetDto;
import com.challenge.entity.AssetEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AssetMapper {

    AssetEntity toEntity(AssetDto assetDto);

    AssetDto toDto(AssetEntity assetEntity);

}
