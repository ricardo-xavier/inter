package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1125")
public class Somador1125 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
