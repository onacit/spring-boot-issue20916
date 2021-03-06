package com.github.onacit.some0;

import com.github.onacit.spring.boot.issue20916.IdentifiableEntityRepositoryService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Validated
@Service
class SomeProductRepositoryService extends IdentifiableEntityRepositoryService<SomeProductRepository, SomeProduct0> {

}
