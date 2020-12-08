package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1514")
public class Somador1514 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
