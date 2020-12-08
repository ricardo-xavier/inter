package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1121")
public class Somador1121 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
