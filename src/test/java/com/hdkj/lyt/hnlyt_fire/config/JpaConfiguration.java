package com.hdkj.lyt.hnlyt_fire.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.hdkj.lyt.**.repository")
public class JpaConfiguration {

}
