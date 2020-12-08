package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1359")
public class Somador1359 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
