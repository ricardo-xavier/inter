package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador323")
public class Somador323 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
