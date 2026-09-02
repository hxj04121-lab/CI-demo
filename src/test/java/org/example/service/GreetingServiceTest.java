package org.example.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GreetingServiceTest {

    @Autowired
    private GreetingService greetingService;

    @Test
    void shouldGreetNamedUser() {
        assertEquals("Hello, Alice!", greetingService.greet("Alice"));
    }

    @Test
    void shouldUseGuestWhenNameIsBlank() {
        assertEquals("Hello, Guest!", greetingService.greet(" "));
    }

    @Test
    void shouldUseGuestWhenNameIsNull() {
        assertEquals("Hello, Guest!", greetingService.greet(null));
    }

    @Test
    void shouldTrimUserName() {
        assertEquals("Hello, Bob!", greetingService.greet("  Bob  "));
    }
}
