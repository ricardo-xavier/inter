package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1645")
public class Somador1645 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
