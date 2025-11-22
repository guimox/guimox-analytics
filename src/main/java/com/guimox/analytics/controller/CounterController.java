package com.guimox.analytics.controller;

import com.guimox.analytics.service.CounterService;
import com.guimox.analytics.dto.CountDtoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/analytics")
public class CounterController {

    private final CounterService counterService;

    public CounterController(CounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping("/hit")
    public CountDtoResponse getCount() {
        Long count = counterService.getCount();
        return new CountDtoResponse(42);
    }

}
