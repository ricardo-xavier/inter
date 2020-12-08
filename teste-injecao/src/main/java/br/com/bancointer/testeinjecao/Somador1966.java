package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1966")
public class Somador1966 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
