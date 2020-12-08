package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1447")
public class Somador1447 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
