package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador132")
public class Somador132 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
