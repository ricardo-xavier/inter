package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1910")
public class Somador1910 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
