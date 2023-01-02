package org.github.swsz2.springproxytutorial.app.v2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigV2 {

  @Bean
  public OrderControllerV2 orderControllerV2() {
    return new OrderControllerV2(orderServiceV2());
  }

  @Bean
  public OrderServiceV2 orderServiceV2() {
    return new OrderServiceV2(orderRepositoryV2());
  }

  @Bean
  public OrderRepositoryV2 orderRepositoryV2() {
    return new OrderRepositoryV2();
  }
}