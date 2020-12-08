package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador17")
public class Somador17 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
