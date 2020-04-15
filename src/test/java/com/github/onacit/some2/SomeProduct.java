package com.github.onacit.some2;

import com.github.onacit.spring.boot.issue447.AuditableEntity2;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
class SomeProduct extends AuditableEntity2<LocalDateTime, Long> {
}
