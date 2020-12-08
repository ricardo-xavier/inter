package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador182")
public class Somador182 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
