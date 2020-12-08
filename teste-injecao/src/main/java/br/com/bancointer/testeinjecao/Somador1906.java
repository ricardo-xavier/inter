package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1906")
public class Somador1906 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
