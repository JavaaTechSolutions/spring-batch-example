package com.sc;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.sc.config.BatchConfig;

@Configuration
@Import(BatchConfig.class)
public class MockBatchConfig {


}