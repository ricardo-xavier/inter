package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1230")
public class Somador1230 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
