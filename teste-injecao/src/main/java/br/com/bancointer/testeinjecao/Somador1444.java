package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1444")
public class Somador1444 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
