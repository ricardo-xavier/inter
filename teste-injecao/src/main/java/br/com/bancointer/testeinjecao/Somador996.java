package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador996")
public class Somador996 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
