package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1843")
public class Somador1843 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
