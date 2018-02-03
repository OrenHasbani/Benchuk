package io.analit.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = { "classpath:application-${environment:dev}.properties" })
public class AnalitConfiguration {
}
