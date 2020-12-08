package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1083")
public class Somador1083 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
