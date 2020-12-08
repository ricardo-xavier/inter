package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador803")
public class Somador803 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
