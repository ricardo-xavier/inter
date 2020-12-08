package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1111")
public class Somador1111 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
