package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1004")
public class Somador1004 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
