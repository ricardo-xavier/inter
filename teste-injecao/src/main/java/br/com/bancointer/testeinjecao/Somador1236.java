package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1236")
public class Somador1236 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
