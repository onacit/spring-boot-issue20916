package com.github.onacit.spring.boot.issue20916;

import org.springframework.data.repository.NoRepositoryBean;

import java.time.temporal.TemporalAccessor;

@NoRepositoryBean
public interface AuditableEntityRepository<
        T extends AuditableEntity<U>, U extends TemporalAccessor & Comparable<? super U>>
        extends IdentifiableEntityRepository<T> {
}
