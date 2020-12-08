package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador559")
public class Somador559 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
