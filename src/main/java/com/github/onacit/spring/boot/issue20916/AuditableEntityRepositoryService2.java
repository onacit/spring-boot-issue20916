package com.github.onacit.spring.boot.issue20916;

import lombok.extern.slf4j.Slf4j;

import java.time.temporal.TemporalAccessor;

@Slf4j
public abstract class AuditableEntityRepositoryService2<
        T extends AuditableEntityRepository2<U, V, W>,
        U extends AuditableEntity2<V, W>,
        V extends TemporalAccessor & Comparable<? super V>,
        W>
        extends AuditableEntityRepositoryService<T, U, V> {
}
