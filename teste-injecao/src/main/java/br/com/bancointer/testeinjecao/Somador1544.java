package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1544")
public class Somador1544 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
