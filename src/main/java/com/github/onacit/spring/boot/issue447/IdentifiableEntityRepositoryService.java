package com.github.onacit.spring.boot.issue447;

import lombok.Getter;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import static lombok.AccessLevel.PUBLIC;

@Slf4j
public abstract class IdentifiableEntityRepositoryService<
        T extends IdentifiableEntityRepository<U>,
        U extends IdentifiableEntity> {

    @Autowired
    @Accessors(fluent = true)
    @Getter(PUBLIC)
    private T repositoryInstance;
}
