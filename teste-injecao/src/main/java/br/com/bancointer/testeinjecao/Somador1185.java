package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1185")
public class Somador1185 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
