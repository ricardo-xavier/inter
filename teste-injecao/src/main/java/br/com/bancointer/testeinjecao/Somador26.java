package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador26")
public class Somador26 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
