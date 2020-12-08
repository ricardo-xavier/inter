package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1007")
public class Somador1007 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
