package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1524")
public class Somador1524 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
