package com.sc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import com.sc.config.BatchConfig;

@SpringBatchTest
@EnableAutoConfiguration
@TestPropertySource(locations = "classpath:application.properties")
@ContextConfiguration(classes = BatchConfig.class)
public class TestBatch {

	@Autowired
	private JobLauncherTestUtils jobLauncherTestUtils;

	@Test
	public void launch_End_To_End_Test() throws Exception {
		JobExecution jobExecution = jobLauncherTestUtils.launchJob();

		assertEquals(ExitStatus.COMPLETED, jobExecution.getExitStatus());
	}
}