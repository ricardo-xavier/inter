package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1278")
public class Somador1278 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
