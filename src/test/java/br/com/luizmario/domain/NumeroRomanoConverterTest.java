package br.com.luizmario.domain;

import br.com.luizmario.domain.domain.NumeroRomanoConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumeroRomanoConverterTest {

    @Test
    public void testConvertRomano_whenCaracterValid() {
        NumeroRomanoConverter converter = new NumeroRomanoConverter();
        var value = converter.toDecimal("X");
        assertEquals(10, value);
    }

    @Test
    public void testConvertRomano_whenCaracterInvalid() {
        NumeroRomanoConverter converter = new NumeroRomanoConverter();
        var value = converter.toDecimal("A");
        assertEquals(0, value);
    }

    @Test
    public void testConvertRomano_whenFirstCaracterGreaterThanNextCaracter() {
        NumeroRomanoConverter converter = new NumeroRomanoConverter();
        var value = converter.toDecimal("XVI");
        assertEquals(16, value);
    }

    @Test
    public void testConvertRomano_whenFirstCaracterLessThanNextCaracter() {
        NumeroRomanoConverter converter = new NumeroRomanoConverter();
        var value = converter.toDecimal("XIV");
        assertEquals(14, value);
    }
}