package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1402")
public class Somador1402 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
