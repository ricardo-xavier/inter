package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1846")
public class Somador1846 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
