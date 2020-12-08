package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1956")
public class Somador1956 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
