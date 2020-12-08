package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1915")
public class Somador1915 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
