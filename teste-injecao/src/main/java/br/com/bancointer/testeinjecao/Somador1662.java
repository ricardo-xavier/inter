package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1662")
public class Somador1662 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
