package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1115")
public class Somador1115 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
