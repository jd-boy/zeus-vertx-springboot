package org.jd.zeus.vertx.springboot.autoconfiguration;

import org.jd.zeus.vertx.springboot.core.SpringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther jd
 */
@Configuration
public class AutoConfiguration {

  @Bean
  VertxWebImportSelector vertxWebImportSelector() {
    return new VertxWebImportSelector();
  }

  @Bean
  SpringUtils zeusSpringUtils() {
    return new SpringUtils();
  }

}
