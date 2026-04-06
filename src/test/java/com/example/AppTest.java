package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

  @Test
  void multiply_shouldReturnProduct() {
    assertEquals(12, App.multiply(3, 4));
  }

  @Test
  void multiply_withZero_shouldReturnZero() {
    assertEquals(0, App.multiply(0, 5));
  }

  @Test
  void multiply_negativeNumbers() {
    assertEquals(-10, App.multiply(-2, 5));
  }
}
