package com.example.judgequizegradle.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.vaadin.flow.server.StreamResource;

public class ImageLoader {
	private static List<File> images = new ArrayList<>();
	private static Random random = new Random();

	static {
		loadAll();
	}

	public static void loadAll() {
		images.clear();
		File topFolder = new File("Questions");
		images.addAll(Arrays.asList(topFolder.listFiles()));
		System.out.println(images.size());
	}

	private static File getRandomFile() {
		return images.remove(random.nextInt(images.size()));
	}

	public static StreamResource getRandomResource() {
		return new StreamResource("Question", () -> {
			try {
				return new FileInputStream(ImageLoader.getRandomFile());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return null;
			}
		});
	}

}
