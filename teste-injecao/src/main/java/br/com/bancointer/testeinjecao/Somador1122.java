package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1122")
public class Somador1122 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
