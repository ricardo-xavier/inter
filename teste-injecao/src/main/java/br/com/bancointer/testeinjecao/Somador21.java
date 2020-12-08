package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador21")
public class Somador21 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
