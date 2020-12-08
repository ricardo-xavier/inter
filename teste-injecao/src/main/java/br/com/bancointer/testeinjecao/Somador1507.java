package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1507")
public class Somador1507 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
