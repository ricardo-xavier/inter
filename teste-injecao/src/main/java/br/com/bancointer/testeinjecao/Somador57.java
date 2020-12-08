package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador57")
public class Somador57 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
