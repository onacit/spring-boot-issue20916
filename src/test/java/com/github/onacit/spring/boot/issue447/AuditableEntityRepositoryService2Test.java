package com.github.onacit.spring.boot.issue447;

import java.time.temporal.TemporalAccessor;

import static java.util.Objects.requireNonNull;

public abstract class AuditableEntityRepositoryService2Test<
        T extends AuditableEntityRepositoryService2<U, V, W, X>,
        U extends AuditableEntityRepository2<V, W, X>,
        V extends AuditableEntity2<W, X>,
        W extends TemporalAccessor & Comparable<? super W>,
        X>
        extends AuditableEntityRepositoryServiceTest<T, U, V, W> {

    protected AuditableEntityRepositoryService2Test(final Class<T> serviceClass, final Class<U> repositoryClass,
                                                    final Class<V> entityClass, final Class<W> temporalClass,
                                                    final Class<X> auditorClass) {
        super(serviceClass, repositoryClass, entityClass, temporalClass);
        this.auditorClass = requireNonNull(auditorClass, "auditorClass is null");
    }

    protected final Class<X> auditorClass;
}
