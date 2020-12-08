package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1605")
public class Somador1605 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
