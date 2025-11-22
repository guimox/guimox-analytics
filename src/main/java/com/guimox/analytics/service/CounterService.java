package com.guimox.analytics.service;

import com.guimox.analytics.repository.CounterRepository;
import org.springframework.stereotype.Service;

@Service
public class CounterService {

    private final CounterRepository counterRepository;

    public CounterService(CounterRepository counterRepository) {
        this.counterRepository = counterRepository;
    }

    public long getCount() {
        return counterRepository.count();
    }
}
