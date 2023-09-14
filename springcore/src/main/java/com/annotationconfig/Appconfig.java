package com.annotationconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.annotationconfig")
public class Appconfig {
}
