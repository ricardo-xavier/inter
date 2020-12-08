package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador122")
public class Somador122 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
