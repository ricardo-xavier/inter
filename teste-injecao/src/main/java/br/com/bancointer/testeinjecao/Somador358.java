package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador358")
public class Somador358 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
