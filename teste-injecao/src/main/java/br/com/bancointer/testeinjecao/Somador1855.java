package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1855")
public class Somador1855 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
