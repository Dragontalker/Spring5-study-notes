package com.dragontalker.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.dragontalker"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {}
