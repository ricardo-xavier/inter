package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1678")
public class Somador1678 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
