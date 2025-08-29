package com.ayhanunlu.audit;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Ayhan");
//        return Optional.of(System.getProperty("user.name"));
//        return Optional.empty();
    }
}
