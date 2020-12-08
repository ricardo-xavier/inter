package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador625")
public class Somador625 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
