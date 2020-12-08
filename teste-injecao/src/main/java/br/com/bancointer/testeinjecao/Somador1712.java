package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1712")
public class Somador1712 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
