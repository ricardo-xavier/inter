package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1400")
public class Somador1400 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
