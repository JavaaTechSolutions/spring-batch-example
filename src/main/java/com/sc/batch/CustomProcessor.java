package com.sc.batch;

import org.springframework.batch.item.ItemProcessor;

public class CustomProcessor implements ItemProcessor<String, String> {

	@Override
	public String process(String data) throws Exception {
		System.out.println("Processing data - " + data);
		data = data.toUpperCase();
		return data;
	}

}