package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1592")
public class Somador1592 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
