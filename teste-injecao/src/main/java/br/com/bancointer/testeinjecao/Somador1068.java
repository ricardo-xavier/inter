package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1068")
public class Somador1068 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
