package com.example.judgequizegradle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.transform.stream.StreamSource;

import com.example.judgequizegradle.utils.ImageLoader;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.InputStreamFactory;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

/**
 * The main view of the application
 */
@Route("")
@Theme(Lumo.class)
@BodySize(height = "100vh", width = "100vw")
@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=yes")
@StyleSheet("frontend://judgequizegradle-theme.css")
public class JudgeQuizeGradleView extends VerticalLayout {
	private Image image = new Image();

	public JudgeQuizeGradleView() {
		setClassName("app-view");

		Button answer = new Button("Show Answer", e -> image.getStyle().remove("clip"));

		Button next = new Button("Next Question!", e -> loadImage());

		loadImage();
		add(answer, next, new HorizontalLayout(image));
	}

	private void loadImage() {
		image.setSrc(ImageLoader.getRandomResource());
		image.getStyle().set("position", "absolute");
		image.getStyle().set("clip", "rect(0,376px,523px,0)");
	}
}