package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador761")
public class Somador761 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
