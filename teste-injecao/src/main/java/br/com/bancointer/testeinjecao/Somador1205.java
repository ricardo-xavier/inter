package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1205")
public class Somador1205 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
