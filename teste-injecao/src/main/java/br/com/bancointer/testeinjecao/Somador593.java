package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador593")
public class Somador593 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
