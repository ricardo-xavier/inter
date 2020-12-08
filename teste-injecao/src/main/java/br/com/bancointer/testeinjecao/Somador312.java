package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador312")
public class Somador312 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
