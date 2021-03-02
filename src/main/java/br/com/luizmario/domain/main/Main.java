package br.com.luizmario.domain.main;

import br.com.luizmario.domain.domain.NumeroRomanoConverter;

public class Main {

    public static void main(String[] args) {
        NumeroRomanoConverter converter = new NumeroRomanoConverter();
        System.out.println(converter.toDecimal("XVI"));
    }
}
