package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1002")
public class Somador1002 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
