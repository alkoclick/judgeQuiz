package com.example.judgequizegradle;

import com.vaadin.flow.server.VaadinServlet;
import com.vaadin.flow.server.VaadinServletConfiguration;

import javax.servlet.annotation.WebServlet;


@WebServlet(urlPatterns = "/*", name = "JudgeQuizeGradleServlet", asyncSupported = true)
@VaadinServletConfiguration(ui = JudgeQuizeGradleUI.class, productionMode = false)
public class JudgeQuizeGradleServlet extends VaadinServlet { }