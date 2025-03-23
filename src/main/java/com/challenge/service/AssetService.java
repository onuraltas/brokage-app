package com.challenge.service;

import com.challenge.dto.AssetDto;

import java.util.List;

public interface AssetService {

    List<AssetDto> findByCustomerId(Integer customerId);
}
