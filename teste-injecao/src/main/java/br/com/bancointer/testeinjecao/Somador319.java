package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador319")
public class Somador319 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
