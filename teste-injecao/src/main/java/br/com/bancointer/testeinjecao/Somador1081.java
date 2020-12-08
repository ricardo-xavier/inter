package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1081")
public class Somador1081 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
