package com.github.onacit.spring.boot.issue447;

import lombok.extern.slf4j.Slf4j;

import java.time.temporal.TemporalAccessor;

@Slf4j
public abstract class AuditableEntityRepositoryService<
        T extends AuditableEntityRepository<U, V>,
        U extends AuditableEntity<V>,
        V extends TemporalAccessor & Comparable<? super V>>
        extends IdentifiableEntityRepositoryService<T, U> {
}
