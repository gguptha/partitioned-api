package io.cloudledger.aperture.config.tenant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tenant")
public class TenantController {

    @GetMapping
    String getTenant() {
        return "Tenant is " + TenantContext.getTenantId();
    }
}
