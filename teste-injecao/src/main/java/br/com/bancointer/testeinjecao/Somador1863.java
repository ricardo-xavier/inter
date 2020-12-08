package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1863")
public class Somador1863 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
