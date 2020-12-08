package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1767")
public class Somador1767 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
