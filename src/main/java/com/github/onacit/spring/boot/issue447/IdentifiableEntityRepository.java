package com.github.onacit.spring.boot.issue447;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IdentifiableEntityRepository<T extends IdentifiableEntity>
        extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {

}
