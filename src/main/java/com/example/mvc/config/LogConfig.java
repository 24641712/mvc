package com.example.mvc.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @Description :
 * Copyright: Copyright (c)2019
 * Company: Tope
 * Created Date : 2019/12/15
 */
@Configuration
public class LogConfig {
        private static final Logger LOG = LoggerFactory.getLogger(LogConfig.class);

        @Bean
        public String logMethod() {
            LOG.info("==========print log==========");
            return new String("hello");
        }
    }
