package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador217")
public class Somador217 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
