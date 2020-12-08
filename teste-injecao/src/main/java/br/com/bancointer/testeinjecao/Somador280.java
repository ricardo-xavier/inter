package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador280")
public class Somador280 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
