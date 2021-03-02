package br.com.luizmario.domain.domain;

import java.util.HashMap;
import java.util.Map;

public class NumeroRomanoConverter {

    private Map<String, Integer> number;

    public NumeroRomanoConverter() {
        this.number = new HashMap<>();
        this.number.put("I", 1);
        this.number.put("V", 5);
        this.number.put("X", 10);
        this.number.put("L", 50);
        this.number.put("D", 500);
        this.number.put("M", 1000);
    }

    public long toDecimal(String number) {
        var value = 0;
        for(int i = 0; i < number.length(); i++)
        {
            var actual = caracterToValue(String.valueOf(number.charAt(i)));
            var nextValue = hasNext(i, number) ? caracterToValue(String.valueOf(number.charAt(i + 1))) : 0;
            if (nextValue != 0 && nextValue > actual) {
                value -= actual;
            } else {
                value += actual;
            }
        }

        return value;
    }

    private boolean hasNext(int index, String number) {
        try {
            number.charAt(index + 1);
            return true;
        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

    private int caracterToValue(String caracter) {
        var value = 0;
        if (existsAlgarithim(caracter)) {
            value = this.number.get(caracter);
        }

        return value;
    }

    private boolean existsAlgarithim(String caracter) {
        return this.number.containsKey(caracter);
    }
}
