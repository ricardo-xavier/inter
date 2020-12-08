package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador77")
public class Somador77 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
