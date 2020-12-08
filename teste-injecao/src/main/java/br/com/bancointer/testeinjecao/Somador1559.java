package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1559")
public class Somador1559 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
