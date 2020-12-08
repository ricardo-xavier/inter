package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador233")
public class Somador233 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
