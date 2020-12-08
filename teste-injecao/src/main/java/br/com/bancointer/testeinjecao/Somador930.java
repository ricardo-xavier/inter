package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador930")
public class Somador930 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
