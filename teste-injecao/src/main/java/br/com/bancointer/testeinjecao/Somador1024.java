package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1024")
public class Somador1024 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
