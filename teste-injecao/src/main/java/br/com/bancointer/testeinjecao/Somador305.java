package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador305")
public class Somador305 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
