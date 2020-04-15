package com.github.onacit.spring.boot.issue20916;

import org.springframework.data.repository.NoRepositoryBean;

import java.time.temporal.TemporalAccessor;

@NoRepositoryBean
public interface AuditableEntityRepository2<
        T extends AuditableEntity2<U, V>,
        U extends TemporalAccessor & Comparable<? super U>,
        V>
        extends AuditableEntityRepository<T, U> {

}
