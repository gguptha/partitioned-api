package io.cloudledger.aperture.config.tenant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.MappedInterceptor;

/*
This bean is required as spring does not intercept jpa rest repository method calls (http requests) and hence
we need to provide a way for spring to intercept the request to resolve the tenant.
 */
@Configuration
public class JPARequestInterceptor {

    @Bean
    public MappedInterceptor addJPARestHttpInterceptor() {
        return new MappedInterceptor(
                null,  // => maps to any repository
                new HttpRequestInterceptor(new HttpHeaderTenantResolver())
        );
    }
}
