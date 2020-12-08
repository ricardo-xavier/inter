package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador72")
public class Somador72 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
