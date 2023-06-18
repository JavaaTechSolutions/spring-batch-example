package com.sc.batch;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;

public class CustomWriter implements ItemWriter<String> {

	@Override
	public void write(Chunk<? extends String> chunk) throws Exception {

		for (String data : chunk) {
			System.out.println("Writing data - " + data);
		}

		System.out.println("Completed writing data.");

	}
}