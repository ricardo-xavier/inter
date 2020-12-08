package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1979")
public class Somador1979 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
