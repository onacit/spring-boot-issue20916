package com.github.onacit.some2;

import com.github.onacit.spring.boot.issue20916.AuditableEntity2;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
class SomeProduct2 extends AuditableEntity2<LocalDateTime, Long> {
}
