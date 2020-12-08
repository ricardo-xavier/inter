package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador502")
public class Somador502 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
