package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador212")
public class Somador212 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
