package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1962")
public class Somador1962 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
