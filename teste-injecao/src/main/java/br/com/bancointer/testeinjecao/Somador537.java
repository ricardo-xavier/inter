package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador537")
public class Somador537 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
