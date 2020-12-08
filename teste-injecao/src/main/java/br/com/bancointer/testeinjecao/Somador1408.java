package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1408")
public class Somador1408 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
