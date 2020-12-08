package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador592")
public class Somador592 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
