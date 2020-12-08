package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1436")
public class Somador1436 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
