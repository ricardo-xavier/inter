package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1925")
public class Somador1925 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
