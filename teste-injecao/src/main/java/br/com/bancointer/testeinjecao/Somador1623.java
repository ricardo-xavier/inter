package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1623")
public class Somador1623 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
