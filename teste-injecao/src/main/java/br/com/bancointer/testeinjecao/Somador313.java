package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador313")
public class Somador313 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
