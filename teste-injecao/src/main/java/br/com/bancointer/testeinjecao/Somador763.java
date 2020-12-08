package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador763")
public class Somador763 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
