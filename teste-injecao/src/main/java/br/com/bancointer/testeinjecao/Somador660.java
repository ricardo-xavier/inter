package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador660")
public class Somador660 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
