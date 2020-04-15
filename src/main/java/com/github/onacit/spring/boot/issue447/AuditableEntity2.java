package com.github.onacit.spring.boot.issue447;

import javax.persistence.MappedSuperclass;
import java.time.temporal.TemporalAccessor;

@MappedSuperclass
public abstract class AuditableEntity2<T extends TemporalAccessor & Comparable<? super T>, U>
        extends AuditableEntity<T> {
}
