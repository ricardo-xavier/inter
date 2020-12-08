package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1232")
public class Somador1232 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
