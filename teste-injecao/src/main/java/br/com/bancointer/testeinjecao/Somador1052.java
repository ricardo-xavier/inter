package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1052")
public class Somador1052 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
