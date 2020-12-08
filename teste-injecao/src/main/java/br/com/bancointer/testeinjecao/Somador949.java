package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador949")
public class Somador949 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
