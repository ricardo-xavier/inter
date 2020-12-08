package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador572")
public class Somador572 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
