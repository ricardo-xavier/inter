package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador936")
public class Somador936 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
