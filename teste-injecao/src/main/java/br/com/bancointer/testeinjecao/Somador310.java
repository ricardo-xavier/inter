package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador310")
public class Somador310 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
