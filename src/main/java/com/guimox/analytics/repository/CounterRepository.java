package com.guimox.analytics.repository;

import com.guimox.analytics.entity.Counter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CounterRepository extends CrudRepository<Counter, Long> {
}
