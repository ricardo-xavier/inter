package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador78")
public class Somador78 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
