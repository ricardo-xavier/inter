package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1238")
public class Somador1238 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
