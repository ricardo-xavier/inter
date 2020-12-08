package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1529")
public class Somador1529 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
