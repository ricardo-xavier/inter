package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador678")
public class Somador678 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
