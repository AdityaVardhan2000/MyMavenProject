package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testSayHello() {
        App app = new App();
        assertEquals("Hello, World!", app.sayHello());
    }
}