package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador80")
public class Somador80 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
