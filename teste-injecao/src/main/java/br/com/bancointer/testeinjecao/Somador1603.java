package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1603")
public class Somador1603 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
