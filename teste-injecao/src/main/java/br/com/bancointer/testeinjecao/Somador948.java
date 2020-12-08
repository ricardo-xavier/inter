package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador948")
public class Somador948 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
