package io.cloudledger.aperture.config.tenant;

import jakarta.validation.constraints.NotNull;

@FunctionalInterface
public interface TenantResolver<T> {

    String resolveTenantId(@NotNull T object);
}
