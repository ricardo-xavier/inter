package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador484")
public class Somador484 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
