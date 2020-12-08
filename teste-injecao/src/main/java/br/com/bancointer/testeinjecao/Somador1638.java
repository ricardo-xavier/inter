package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1638")
public class Somador1638 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
