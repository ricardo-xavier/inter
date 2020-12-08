package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador415")
public class Somador415 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
