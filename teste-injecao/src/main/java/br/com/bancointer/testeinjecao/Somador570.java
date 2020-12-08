package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador570")
public class Somador570 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
