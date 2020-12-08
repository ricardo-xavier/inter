package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador602")
public class Somador602 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
