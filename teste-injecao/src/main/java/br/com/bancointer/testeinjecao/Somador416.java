package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador416")
public class Somador416 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
