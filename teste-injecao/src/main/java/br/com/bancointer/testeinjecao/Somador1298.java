package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1298")
public class Somador1298 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
