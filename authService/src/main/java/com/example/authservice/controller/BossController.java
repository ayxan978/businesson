package com.example.authservice.controller;

import com.example.authservice.dto.BossDtoRequest;
import com.example.authservice.dto.BossDtoResponse;
import com.example.authservice.service.BossService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BossController {
    private final BossService bossService;

    @PostMapping("/boss/register")
    public BossDtoResponse saveBoss(@RequestBody BossDtoRequest request){
        return bossService.saveBoss(request);
    }

    @PutMapping("/boss/change/{id}")
    public BossDtoResponse updateBoss(@PathVariable Long id,
                                      @RequestBody BossDtoRequest request){
        return bossService.updateBoss(request, id);
    }

    @GetMapping("/boss/login")
    public BossDtoResponse getBossLogin(){
        return bossService.findById(id);
    }


    @GetMapping("/boss/get/{id}")
    public BossDtoResponse findById(@PathVariable Long id){
        return bossService.findById(id);
    }
}
