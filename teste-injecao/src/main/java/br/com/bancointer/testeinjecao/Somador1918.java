package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1918")
public class Somador1918 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
