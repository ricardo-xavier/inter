package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1440")
public class Somador1440 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
