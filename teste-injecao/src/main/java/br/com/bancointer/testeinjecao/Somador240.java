package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador240")
public class Somador240 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
