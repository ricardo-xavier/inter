package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1490")
public class Somador1490 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
