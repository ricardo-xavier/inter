package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1071")
public class Somador1071 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
