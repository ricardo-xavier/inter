package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador729")
public class Somador729 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
