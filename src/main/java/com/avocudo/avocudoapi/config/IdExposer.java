package com.avocudo.avocudoapi.config;

import com.avocudo.avocudoapi.entities.Owner;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
public class IdExposer extends RepositoryRestMvcConfiguration {

    public IdExposer(ApplicationContext context, ObjectFactory<ConversionService> conversionService) {
        super(context, conversionService);
    }

    @Override
    public RepositoryRestConfiguration repositoryRestConfiguration() {
        return super.repositoryRestConfiguration().exposeIdsFor(Owner.class);
    }
}