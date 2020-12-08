package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1698")
public class Somador1698 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
