package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador372")
public class Somador372 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
