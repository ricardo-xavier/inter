package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1632")
public class Somador1632 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
