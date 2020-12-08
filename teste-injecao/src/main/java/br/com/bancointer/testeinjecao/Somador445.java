package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador445")
public class Somador445 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
