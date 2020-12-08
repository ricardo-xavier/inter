package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador443")
public class Somador443 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
