package com.github.onacit.some2;

import com.github.onacit.spring.boot.issue447.AuditableEntityRepositoryService2;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;

@Validated
@Service
class SomeProductRepositoryService
        extends AuditableEntityRepositoryService2<SomeProductRepository, SomeProduct, LocalDateTime, Long> {

}
