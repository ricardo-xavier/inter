package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador942")
public class Somador942 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
