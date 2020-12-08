package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1445")
public class Somador1445 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
