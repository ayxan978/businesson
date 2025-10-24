package com.example.authservice.controller;

import com.example.authservice.dto.BossDtoRequest;
import com.example.authservice.dto.BossDtoResponse;
import com.example.authservice.service.BossService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BossController {
    private final BossService bossService;

    @PostMapping("/boss")
    public BossDtoResponse saveBoss(@RequestBody BossDtoRequest request){
        return bossService.saveBoss(request);
    }

    @PutMapping("/boss/{id}")
    public BossDtoResponse updateBoss(@PathVariable Long id,
                                      @RequestBody BossDtoRequest request){
        return bossService.updateBoss(request, id);
    }

    @GetMapping("/boss/{id}")
    public BossDtoResponse findById(@PathVariable Long id){
        return bossService.findById(id);
    }
}
