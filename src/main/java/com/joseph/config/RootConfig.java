package com.joseph.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.core.type.filter.RegexPatternTypeFilter;
import org.springframework.stereotype.Controller;

import java.util.regex.Pattern;

/**
 * Created by jotaiwan on 3/07/2017.
 */
@Configuration
@ComponentScan(basePackages={"com.joseph"},
        excludeFilters={
                @ComponentScan.Filter(type= FilterType.ANNOTATION, value=Controller.class)
        })
public class RootConfig {
}
