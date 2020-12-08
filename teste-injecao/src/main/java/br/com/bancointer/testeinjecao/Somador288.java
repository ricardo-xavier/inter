package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador288")
public class Somador288 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
