package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador43")
public class Somador43 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
