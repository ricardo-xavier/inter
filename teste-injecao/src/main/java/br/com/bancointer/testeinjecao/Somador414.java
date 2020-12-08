package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador414")
public class Somador414 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
