package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1916")
public class Somador1916 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
