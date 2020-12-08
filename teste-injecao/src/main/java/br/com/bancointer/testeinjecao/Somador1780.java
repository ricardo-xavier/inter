package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1780")
public class Somador1780 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
