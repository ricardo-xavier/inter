package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1896")
public class Somador1896 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
