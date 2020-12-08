package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador632")
public class Somador632 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
