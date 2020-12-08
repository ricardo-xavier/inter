package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1946")
public class Somador1946 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
