package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador421")
public class Somador421 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
