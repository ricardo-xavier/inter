package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1781")
public class Somador1781 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
