package com.uitesting.data;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Data
@PropertySource({"classpath:configuration.properties"})
public class ConfigurationData {

    @Value("${browser}")
    private String browser;

    @Value("${testType}")
    private String testType;

}
