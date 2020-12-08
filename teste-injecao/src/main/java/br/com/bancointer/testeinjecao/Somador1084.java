package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1084")
public class Somador1084 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
