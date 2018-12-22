package com.avocudo.avocudoapi.config;

import com.avocudo.avocudoapi.entities.Comment;
import com.avocudo.avocudoapi.entities.Ingredient;
import com.avocudo.avocudoapi.entities.Meal;
import com.avocudo.avocudoapi.entities.Owner;
import com.avocudo.avocudoapi.entities.Rating;
import com.avocudo.avocudoapi.entities.RegularUser;
import com.avocudo.avocudoapi.entities.Report;
import com.avocudo.avocudoapi.entities.Restaurant;
import com.avocudo.avocudoapi.entities.RestaurantChain;

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
        return super.repositoryRestConfiguration().exposeIdsFor(Comment.class, Ingredient.class, Meal.class,
                Owner.class, Rating.class, RegularUser.class, Report.class, Restaurant.class, RestaurantChain.class);
    }
}