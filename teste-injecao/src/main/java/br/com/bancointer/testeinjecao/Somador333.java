package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador333")
public class Somador333 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
