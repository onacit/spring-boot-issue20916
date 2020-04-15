package com.github.onacit.some0;

import com.github.onacit.spring.boot.issue20916.IdentifiableEntityRepositoryServiceTest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class SomeProductRepositoryServiceTest
        extends IdentifiableEntityRepositoryServiceTest<SomeProductRepositoryService, SomeProductRepository, SomeProduct0> {

    SomeProductRepositoryServiceTest() {
        super(SomeProductRepositoryService.class, SomeProductRepository.class, SomeProduct0.class);
    }

//    @MockBean
//    private SomeProductRepository repositoryInstance;
}
