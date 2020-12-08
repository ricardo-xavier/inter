package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador510")
public class Somador510 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
