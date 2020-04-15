package com.github.onacit.spring.boot.issue447;

import java.time.temporal.TemporalAccessor;

import static java.util.Objects.requireNonNull;

public abstract class AuditableEntityRepositoryServiceTest<
        T extends AuditableEntityRepositoryService<U, V, W>,
        U extends AuditableEntityRepository<V, W>,
        V extends AuditableEntity<W>,
        W extends TemporalAccessor & Comparable<? super W>>
        extends IdentifiableEntityRepositoryServiceTest<T, U, V> {

    protected AuditableEntityRepositoryServiceTest(final Class<T> serviceClass, final Class<U> repositoryClass,
                                                   final Class<V> entityClass, final Class<W> temporalClass) {
        super(serviceClass, repositoryClass, entityClass);
        this.temporalClass = requireNonNull(temporalClass, "temporalClass is null");
    }

    protected final Class<W> temporalClass;
}
