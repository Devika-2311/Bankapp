package com.example.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.view.RedirectView;

import com.example.controller.appController;

public class appControllerTest {

	 @Test
	    void testGetDevices() {
	        // Create a new instance of the appController
	        appController appController = new appController();

	        // Call the getDevices method
	        String result = appController.getDevices();

	        // Verify the result
	        assertEquals("index.html", result);
	    }
    @Test
    void testGetAdmin() {
        // Create a new instance of the appController
        appController appController = new appController();

        // Call the getAdmin method
        RedirectView redirectView = appController.getAdmin();

        // Verify the result
        assertEquals("http://localhost:8889/admin/login", redirectView.getUrl());
    }

    @Test
    void testGetCustomer() {
        // Create a new instance of the appController
        appController appController = new appController();

        // Call the getCustomer method
        RedirectView redirectView = appController.getCustomer();

        // Verify the result
        assertEquals("http://localhost:8888/account/login", redirectView.getUrl());
    }
}
