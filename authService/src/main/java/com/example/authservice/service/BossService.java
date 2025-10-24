package com.example.authservice.service;

import com.example.authservice.dto.BossDtoRequest;
import com.example.authservice.dto.BossDtoResponse;

public interface BossService {
    BossDtoResponse saveBoss(BossDtoRequest request);
    BossDtoResponse updateBoss(BossDtoRequest request, Long id);
}
