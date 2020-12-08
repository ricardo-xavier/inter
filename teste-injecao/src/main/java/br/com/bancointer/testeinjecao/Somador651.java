package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador651")
public class Somador651 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
