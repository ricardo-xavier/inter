package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador719")
public class Somador719 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
