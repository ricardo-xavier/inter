package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador65")
public class Somador65 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
