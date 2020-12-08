package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador938")
public class Somador938 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
