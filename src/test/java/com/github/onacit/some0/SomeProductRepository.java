package com.github.onacit.some0;

import com.github.onacit.spring.boot.issue447.IdentifiableEntityRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SomeProductRepository extends IdentifiableEntityRepository<SomeProduct> {

}
