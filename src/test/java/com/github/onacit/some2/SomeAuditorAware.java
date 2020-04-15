package com.github.onacit.some2;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

import static java.util.Optional.empty;

class SomeAuditorAware implements AuditorAware<Long> {

    // -----------------------------------------------------------------------------------------------------------------
    @Override
    public Optional<Long> getCurrentAuditor() {
        return empty();
    }
}
