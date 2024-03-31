package io.cloudledger.aperture.config.tenant;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

@Component
public class HttpHeaderTenantResolver implements TenantResolver<HttpServletRequest> {

    @Override
    public String resolveTenantId(@NotNull HttpServletRequest request) {
        return request.getHeader("X-TenantId");
    }
}
