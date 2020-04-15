package com.github.onacit.some2;

import com.github.onacit.spring.boot.issue20916.AuditableEntityRepositoryService2Test;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
class SomeProductRepositoryServiceTest
        extends AuditableEntityRepositoryService2Test<SomeProductRepositoryService, SomeProductRepository, SomeProduct2, LocalDateTime, Long> {

    SomeProductRepositoryServiceTest() {
        super(SomeProductRepositoryService.class, SomeProductRepository.class, SomeProduct2.class, LocalDateTime.class, Long.class);
    }
}
