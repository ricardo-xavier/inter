package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador899")
public class Somador899 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
