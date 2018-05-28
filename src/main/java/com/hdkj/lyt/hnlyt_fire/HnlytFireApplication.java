package com.hdkj.lyt.hnlyt_fire;

import com.hdkj.lyt.hnlyt_fire.common.BaseRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;


@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.hdkj.lyt.hnlyt_fire.repository"}, repositoryBaseClass = BaseRepositoryImpl.class)
public class HnlytFireApplication {

	public static void main(String[] args) {
		SpringApplication.run(HnlytFireApplication.class, args);
	}

}
