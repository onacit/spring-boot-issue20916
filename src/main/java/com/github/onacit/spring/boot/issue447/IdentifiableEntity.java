package com.github.onacit.spring.boot.issue447;

import lombok.Getter;

import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Positive;

import static javax.persistence.GenerationType.IDENTITY;

@MappedSuperclass
@Getter
public abstract class IdentifiableEntity {

    @Positive
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
}
