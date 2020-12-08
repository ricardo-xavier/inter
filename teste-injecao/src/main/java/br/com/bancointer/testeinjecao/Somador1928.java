package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1928")
public class Somador1928 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
