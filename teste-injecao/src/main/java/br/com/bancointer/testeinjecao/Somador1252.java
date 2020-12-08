package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1252")
public class Somador1252 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
