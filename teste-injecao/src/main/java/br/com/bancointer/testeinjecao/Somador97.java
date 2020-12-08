package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador97")
public class Somador97 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
