package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1713")
public class Somador1713 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
