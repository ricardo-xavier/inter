package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1145")
public class Somador1145 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
