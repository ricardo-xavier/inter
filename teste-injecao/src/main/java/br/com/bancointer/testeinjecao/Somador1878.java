package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1878")
public class Somador1878 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
