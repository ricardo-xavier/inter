package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador710")
public class Somador710 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
