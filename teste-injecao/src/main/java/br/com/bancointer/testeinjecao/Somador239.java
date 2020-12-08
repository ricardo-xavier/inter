package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador239")
public class Somador239 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
