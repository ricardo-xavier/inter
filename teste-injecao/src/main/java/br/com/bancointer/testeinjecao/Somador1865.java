package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1865")
public class Somador1865 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
