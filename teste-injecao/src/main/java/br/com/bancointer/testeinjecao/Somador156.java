package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador156")
public class Somador156 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
