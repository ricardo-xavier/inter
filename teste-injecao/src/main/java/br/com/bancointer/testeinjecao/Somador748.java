package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador748")
public class Somador748 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
