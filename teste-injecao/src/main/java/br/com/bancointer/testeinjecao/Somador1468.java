package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1468")
public class Somador1468 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
