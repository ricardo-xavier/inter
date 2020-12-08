package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1023")
public class Somador1023 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
