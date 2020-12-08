package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador79")
public class Somador79 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
