package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1182")
public class Somador1182 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
