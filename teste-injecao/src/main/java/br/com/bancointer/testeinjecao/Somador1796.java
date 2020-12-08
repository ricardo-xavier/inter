package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1796")
public class Somador1796 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
