package com.github.onacit.some0;

import com.github.onacit.spring.boot.issue20916.IdentifiableEntityRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SomeProductRepository extends IdentifiableEntityRepository<SomeProduct> {

}
