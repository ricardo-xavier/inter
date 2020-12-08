package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador261")
public class Somador261 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
