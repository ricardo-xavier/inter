package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1390")
public class Somador1390 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
