package com.example.authservice.service.impl;

import com.example.authservice.dto.BossDtoRequest;
import com.example.authservice.dto.BossDtoResponse;
import com.example.authservice.model.BossModel;
import com.example.authservice.repository.BossRepository;
import com.example.authservice.service.BossService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BossServiceImpl implements BossService {
    private final ModelMapper modelMapper;
    private final BossRepository bossRepository;

    @Override
    public BossDtoResponse saveBoss(BossDtoRequest request) {
        BossModel bossModel = modelMapper.map(request, BossModel.class);
        BossModel DB = bossRepository.save(bossModel);
        return modelMapper.map(DB, BossDtoResponse.class);
    }

    @Override
    public BossDtoResponse updateBoss(BossDtoRequest request, Long id) {
        Optional<BossModel> optional = bossRepository.findById(id);
        if (optional.isEmpty()) {
            return null;
        }

        BossModel bossModel = optional.get();
        modelMapper.map(request, bossModel);
        BossModel DB = bossRepository.save(bossModel);

        return modelMapper.map(DB, BossDtoResponse.class);
    }
}
