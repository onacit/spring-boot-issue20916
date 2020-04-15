package com.github.onacit.spring.boot.issue447;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.temporal.TemporalAccessor;

@EntityListeners({AuditingEntityListener.class})
@MappedSuperclass
public abstract class AuditableEntity<T extends TemporalAccessor & Comparable<? super T>> extends IdentifiableEntity {
}
