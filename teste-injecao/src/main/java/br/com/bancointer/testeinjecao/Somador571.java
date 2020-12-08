package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador571")
public class Somador571 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
