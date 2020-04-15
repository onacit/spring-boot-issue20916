package com.github.onacit.some2;

import com.github.onacit.spring.boot.issue447.AuditableEntityRepositoryService2Test;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
class SomeProductRepositoryServiceTest
        extends AuditableEntityRepositoryService2Test<SomeProductRepositoryService, SomeProductRepository, SomeProduct, LocalDateTime, Long> {

    SomeProductRepositoryServiceTest() {
        super(SomeProductRepositoryService.class, SomeProductRepository.class, SomeProduct.class, LocalDateTime.class, Long.class);
    }
}
