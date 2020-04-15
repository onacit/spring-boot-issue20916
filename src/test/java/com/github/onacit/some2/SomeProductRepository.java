package com.github.onacit.some2;

import com.github.onacit.spring.boot.issue447.AuditableEntityRepository2;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
interface SomeProductRepository extends AuditableEntityRepository2<SomeProduct, LocalDateTime, Long> {

}
