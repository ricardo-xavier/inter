package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador557")
public class Somador557 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
