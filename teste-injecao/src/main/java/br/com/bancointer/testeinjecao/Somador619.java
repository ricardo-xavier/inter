package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador619")
public class Somador619 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
