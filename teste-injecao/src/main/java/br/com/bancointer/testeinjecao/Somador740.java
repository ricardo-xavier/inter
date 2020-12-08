package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador740")
public class Somador740 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
