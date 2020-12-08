package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador157")
public class Somador157 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
