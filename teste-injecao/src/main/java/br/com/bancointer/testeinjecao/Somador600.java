package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador600")
public class Somador600 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
