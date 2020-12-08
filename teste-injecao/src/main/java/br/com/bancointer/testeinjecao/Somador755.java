package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador755")
public class Somador755 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
