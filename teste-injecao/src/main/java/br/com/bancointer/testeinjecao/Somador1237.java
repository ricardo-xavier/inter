package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1237")
public class Somador1237 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
