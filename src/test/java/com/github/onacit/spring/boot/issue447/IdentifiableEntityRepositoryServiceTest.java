package com.github.onacit.spring.boot.issue447;

import lombok.Getter;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import javax.annotation.PostConstruct;

import static java.util.Objects.requireNonNull;
import static lombok.AccessLevel.PROTECTED;
import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
@Slf4j
public abstract class IdentifiableEntityRepositoryServiceTest<
        T extends IdentifiableEntityRepositoryService<U, V>,
        U extends IdentifiableEntityRepository<V>,
        V extends IdentifiableEntity> {

    protected IdentifiableEntityRepositoryServiceTest(final Class<T> serviceClass, final Class<U> repositoryClass,
                                                      final Class<V> entityClass) {
        super();
        this.serviceClass = requireNonNull(serviceClass, "serviceClass is null");
        this.repositoryClass = requireNonNull(repositoryClass, "repositoryClass is null");
        this.entityClass = requireNonNull(entityClass, "entityClass is null");
    }

    @PostConstruct
    private void onPostConstruct() {
        log.info("serviceInstance.repositoryInstance: {} {} {}", serviceInstance.repositoryInstance(),
                 serviceInstance.repositoryInstance().hashCode(), serviceInstance.repositoryInstance().getClass());
        log.info("repositoryInstance: {} {} {}", repositoryInstance, repositoryInstance.hashCode(),
                 repositoryInstance.getClass());
    }

    @DisplayName("assert serviceInstance.repositoryInstance is same as repositoryInstance")
    @Test
    void assertServiceInstanceRepositoryInstanceIsSameAsRepositoryInstance() {
        assertSame(serviceInstance.repositoryInstance(), repositoryInstance);
    }

    protected final Class<T> serviceClass;

    protected final Class<U> repositoryClass;

    protected final Class<V> entityClass;

    @Autowired
    @Accessors(fluent = true)
    @Getter(PROTECTED)
    private T serviceInstance;

    @MockBean
    @Accessors(fluent = true)
    @Getter(PROTECTED)
    private U repositoryInstance;
}
