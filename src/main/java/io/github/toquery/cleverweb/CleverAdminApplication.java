package io.github.toquery.cleverweb;

import io.github.toquery.framework.dao.EnableAppJpaRepositories;
//import io.github.toquery.framework.data.rest.annotation.EnableAppRepositoryRest;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
// import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication//(scanBasePackages = {"io.github.toquery.cleverweb"})
//@EnableAppRepositoryRest
@EntityScan //(basePackages = {"io.github.toquery.cleverweb.entity"})
@EnableAppJpaRepositories(basePackages = {"io.github.toquery.cleverweb.dao"})
public class CleverAdminApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(CleverAdminApplication.class)
      .run(args);
//     SpringApplication.run(CleverWebApplication.class, args);
  }
}

