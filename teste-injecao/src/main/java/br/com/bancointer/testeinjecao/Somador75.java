package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador75")
public class Somador75 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
