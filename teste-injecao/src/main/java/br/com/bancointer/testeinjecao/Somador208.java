package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador208")
public class Somador208 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
