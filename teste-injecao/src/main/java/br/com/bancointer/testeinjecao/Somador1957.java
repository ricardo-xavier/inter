package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1957")
public class Somador1957 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
