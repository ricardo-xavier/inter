package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1035")
public class Somador1035 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
