package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1975")
public class Somador1975 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
