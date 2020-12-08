package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1169")
public class Somador1169 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
