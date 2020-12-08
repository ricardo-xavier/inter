package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador359")
public class Somador359 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
