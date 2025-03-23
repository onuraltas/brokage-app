package com.challenge.service.impl;

import com.challenge.dto.AssetDto;
import com.challenge.mapper.AssetMapper;
import com.challenge.repository.AssetRepository;
import com.challenge.service.AssetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class AssetServiceImpl implements AssetService {

    private final AssetRepository assetRepository;
    private final AssetMapper assetMapper;

    @Override
    public List<AssetDto> findByCustomerId(Integer customerId) {
        var assetEntityList = assetRepository.findByCustomerId(customerId);

        return assetEntityList.stream().map(assetMapper::toDto).toList();
    }

}
