package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1179")
public class Somador1179 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
