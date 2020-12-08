package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador355")
public class Somador355 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
